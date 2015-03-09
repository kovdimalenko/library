package com.kov;

import com.kov.library.dto.UserDTO;
import com.kov.library.service.user.UserService;
import com.kov.library.service.user.impl.UserServiceImpl;

/**
 * Created by Дима on 09.03.15.
 */
public class CRUDUsersTest {

    public static void main(String[] args) {
        getUserByIdTest(1);
    }


    public static void getUserByIdTest(Integer id){
        UserService userService = new UserServiceImpl();
        UserDTO userById = userService.getUserById(1);
        System.out.println(userById);
    }
}
