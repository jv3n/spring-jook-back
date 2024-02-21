package com.jve.app.user;

import com.jve.app.tables.records.UserRecord;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class UserService {
    private final UserDao userDao;
    private final UserMapper userMapper;

    public UserService(UserDao userDao, UserMapper userMapper) {
        this.userDao = userDao;
        this.userMapper = userMapper;
    }

    @Transactional
    public UserDto getUserById(Long id) {
        UserRecord user = userDao.findById(id);
        return userMapper.userToDTO(user);
    }
}
