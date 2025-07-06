package com.jve.app.infrastructure.controller.model.command;

import java.util.List;

public record PageRequest(int page, int size, List<SortRequest> sort) {

}
