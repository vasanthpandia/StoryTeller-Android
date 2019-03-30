package com.teamfalcon.storyteller;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;


public class User {
    @SerializedName("_id")
    @Expose
    String _id;

    @SerializedName("username")
    @Expose
    String username;

    @SerializedName("email")
    @Expose
    String email;

    @SerializedName("age")
    @Expose
    int age;

    @SerializedName("story")
    @Expose
    Story[] story;

    public String get_id() {
        return _id;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getUsername() {
        return username;
    }

    public Story[] getStory() {
        return story;
    }
}
