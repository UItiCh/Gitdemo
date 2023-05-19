package com.HG.pojo;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: Gang Chen
 * @Date: 2023/05/19/8:27
 * @Description:
 **/
public class User {
    private int id;
    private String name;
    private String pswd;

    public User(String name, String pswd) {
        this.name = name;
        this.pswd = pswd;
    }

    public User(int id, String name, String pswd) {
        this.id = id;
        this.name = name;
        this.pswd = pswd;
    }

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPswd() {
        return pswd;
    }

    public void setPswd(String pswd) {
        this.pswd = pswd;
    }
}
