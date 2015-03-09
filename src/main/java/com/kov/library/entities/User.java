package com.kov.library.entities;

/**
 * Created by Дима on 09.03.15.
 */
public class User {

    private Integer id;
    private String name;
    private String sername;
    private String login;
    private String password;

    public User() {
    }

    public User(Integer id, String name, String sername, String login, String password) {
        this.id = id;
        this.name = name;
        this.sername = sername;
        this.login = login;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSername() {
        return sername;
    }

    public void setSername(String sername) {
        this.sername = sername;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
