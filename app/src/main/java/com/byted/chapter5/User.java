package com.byted.chapter5;

import com.google.gson.annotations.SerializedName;

/**
 * "admin": false,
 * "chapterTops": [],
 * "collectIds": [],
 * "email": "",
 * "icon": "",
 * "id": 58872,
 * "nickname": "wwwsjdajsd",
 * "password": "",
 * "publicName": "wwwsjdajsd",
 * "token": "",
 * "type": 0,
 * "username": "wwwsjdajsd"
 */
class User {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

}
