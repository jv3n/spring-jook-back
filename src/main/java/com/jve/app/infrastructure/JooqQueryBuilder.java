package com.jve.app.infrastructure;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import org.jooq.Condition;
import org.jooq.DSLContext;
import org.jooq.Field;
import org.jooq.OrderField;
import org.jooq.Record;
import org.jooq.SelectConditionStep;
import org.jooq.SelectLimitStep;
import org.jooq.Table;
import org.jooq.impl.DSL;
import org.springframework.util.StringUtils;

public class JooqQueryBuilder<T extends Record> {

  private final DSLContext dsl;
  private final Table<T> table;

  private final Map<String, Function<String, Field<?>>> columnMapping;

  private final List<Condition> conditions = new ArrayList<>();

  private int limit = 50;
  private int offset = 0;

  private final List<OrderField<?>> orderBy = new ArrayList<>();

  public JooqQueryBuilder(DSLContext dsl, Table<T> table,
      Map<String, Function<String, Field<?>>> columnMapping) {
    this.dsl = dsl;
    this.table = table;
    this.columnMapping = columnMapping;
  }

  public JooqQueryBuilder<T> addCaseInsensitiveLike(String logicalFieldName, String value) {
    if (StringUtils.hasText(value) && columnMapping.containsKey(logicalFieldName)) {
      Field<String> field = (Field<String>) columnMapping.get(logicalFieldName).apply(logicalFieldName);
      conditions.add(DSL.upper(field).like("%" + value.toUpperCase() + "%"));
    }
    return this;
  }

  public JooqQueryBuilder<T> addCaseInsensitiveEquals(String logicalFieldName, String value) {
    if (StringUtils.hasText(value) && columnMapping.containsKey(logicalFieldName)) {
      Field<String> field = (Field<String>) columnMapping.get(logicalFieldName).apply(logicalFieldName);
      conditions.add(DSL.upper(field).eq(value.toUpperCase()));
    }
    return this;
  }

  public JooqQueryBuilder<T> setPage(int pageNumber, int pageSize) {
    this.limit = pageSize;
    this.offset = pageNumber * pageSize;
    return this;
  }

  public <R> List<R> fetch(Function<Record, R> mapper) {
    Condition whereCondition = conditions.isEmpty()
        ? DSL.trueCondition()
        : DSL.and(conditions);

    SelectConditionStep<T> step = dsl.selectFrom(table).where(whereCondition);

    SelectLimitStep<T> finalStep = (orderBy != null)
        ? step.orderBy(orderBy)
        : step;

    return finalStep.limit(limit).offset(offset).fetch()
        .map(mapper::apply);
  }

  public int fetchCount() {
    Condition combined = conditions.isEmpty() ? DSL.trueCondition() : conditions.stream().reduce(Condition::and).get();
    return dsl.selectCount()
        .from(table)
        .where(combined)
        .fetchOne(0, int.class);
  }

  public JooqQueryBuilder<T> addSort(String logicalFieldName, boolean ascending) {
    if (columnMapping.containsKey(logicalFieldName)) {
      Field<?> field = columnMapping.get(logicalFieldName).apply(logicalFieldName);
      orderBy.add(ascending ? field.asc() : field.desc());
    } else {
      throw new IllegalArgumentException("Unknown sort field: " + logicalFieldName);
    }
    return this;
  }
}
