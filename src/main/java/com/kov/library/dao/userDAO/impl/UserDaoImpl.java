package com.kov.library.dao.userDAO.impl;

import com.kov.library.dao.connection.EntityManager;
import com.kov.library.dao.userDAO.UserDao;
import com.kov.library.entities.User;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Дима on 09.03.15.
 */
public class UserDaoImpl implements UserDao {

    public User getUserById(Integer id) {

        EntityManager em = new EntityManager();
        Connection con = em.getConnection();
        User user = null;
        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from user where id = " + id);
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSername(resultSet.getString("sername"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public User getInsertUser(Integer id, String name, String sername, String login, String password) {

        EntityManager em = new EntityManager();
        Connection con = em.getConnection();
        User user = null;

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("insert into user values ( , , , , )" + id + name + sername + login + password);
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSername(resultSet.getString("sername"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User getDeleteUser(Integer id, String name, String sername, String login, String password) {

        EntityManager em = new EntityManager();
        Connection con = em.getConnection();
        User user = null;

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("delete from user where id '',name '',sername '', login '', password ''" + id + name + sername + login + password);

            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSername(resultSet.getString("sername"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public User getUpdateUser(Integer id, String name, String sername, String login, String password) {

        EntityManager em = new EntityManager();
        Connection con = em.getConnection();
        User user = null;

        try {
            Statement statement = con.createStatement();
            ResultSet resultSet = statement.executeQuery("update user set " + id + name + sername + login + password);

            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setName(resultSet.getString("name"));
                user.setSername(resultSet.getString("sername"));
                user.setLogin(resultSet.getString("login"));
                user.setPassword(resultSet.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }
}
