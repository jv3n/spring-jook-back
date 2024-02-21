package com.jve.app.user;

import com.jve.app.tables.records.UserRecord;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto userToDTO(UserRecord user);
}
