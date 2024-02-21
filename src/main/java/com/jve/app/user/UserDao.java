package com.jve.app.user;

import com.jve.app.tables.User;
import com.jve.app.tables.records.UserRecord;
import org.jooq.DSLContext;
import org.springframework.stereotype.Repository;

import static com.jve.app.Tables.USER;


@Repository
public class UserDao {
    private final DSLContext dslContext;

    public UserDao(DSLContext dslContext) {
        this.dslContext = dslContext;
    }

    public UserRecord findById(Long id) {
        return dslContext.selectFrom(USER)
                .where(USER.ID.eq(id))
                .fetchOneInto(UserRecord.class);
    }
}
