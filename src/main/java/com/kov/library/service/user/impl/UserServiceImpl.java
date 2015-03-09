package com.kov.library.service.user.impl;

import com.kov.library.dao.userDAO.UserDao;
import com.kov.library.dao.userDAO.impl.UserDaoImpl;
import com.kov.library.dto.UserDTO;
import com.kov.library.entities.User;
import com.kov.library.service.user.UserService;
import com.kov.library.transformer.UserTransform;

/**
 * Created by Дима on 09.03.15.
 */
public class UserServiceImpl implements UserService {

    @Override
    public UserDTO getUserById(Integer id) {
        UserDTO userDTO = null;
        UserDao userDao = new UserDaoImpl();
        User user = userDao.getUserById(id);
        if (user != null) {
            userDTO = UserTransform.TRANSFORM_USER_DTO(user);
        }
        return userDTO;
    }

}
