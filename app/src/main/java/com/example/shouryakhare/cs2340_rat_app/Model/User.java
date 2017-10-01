package com.example.shouryakhare.cs2340_rat_app.Model;

/**
 * Created by shouryakhare on 9/22/17.
 *
 * Information holder - Represents a single user in model.
 */

public class User {

    /*
    Represents username of user.
     */
    private String username;

    /*
    Represents password of user.
     */
    private String password;

    /*
    Represents whether user is admin or normal.
     */
    private boolean admin;

    /*
    Getters
     */
    public String getUsername() { return username; }
    public String getPassword() { return password; }
    public boolean getAdmin() {return admin; }

    /*
    3 arg constructor
     */
    public User(String username, String password, boolean admin) {
        this.username = username;
        this.password = password;
        this.admin = admin;
    }
}
