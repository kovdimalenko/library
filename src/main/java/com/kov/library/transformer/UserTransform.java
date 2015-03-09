package com.kov.library.transformer;

import com.kov.library.dto.UserDTO;
import com.kov.library.entities.User;

/**
 * Created by Дима on 09.03.15.
 */
public class UserTransform {

    public static User TRANSFORM_USER(UserDTO userDTO) {
        User user = new User();
        user.setId(userDTO.getId());
        return user;
    }

    public static UserDTO TRANSFORM_USER_DTO(User user) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(user.getId());
        userDTO.setName(user.getName());
        userDTO.setSername(user.getSername());
        userDTO.setLogin(user.getLogin());
        userDTO.setPassword(user.getPassword());
        return userDTO;
    }
}
