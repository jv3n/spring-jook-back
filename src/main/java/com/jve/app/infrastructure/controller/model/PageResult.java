package com.jve.app.infrastructure.controller.model;

import java.util.List;

public record PageResult<T>(
    List<T> content,
    int page,
    int size,
    long totalElements,
    int totalPages
) {}
