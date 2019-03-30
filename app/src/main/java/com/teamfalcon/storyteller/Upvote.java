package com.teamfalcon.storyteller;

import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;

public class Upvote {
    @SerializedName("_id")
    @Expose
    String _id;

    @SerializedName("username")
    @Expose
    String username;

    @SerializedName("storyname")
    @Expose
    String storyname;

    @SerializedName("user")
    @Expose
    User user;

    @SerializedName("story")
    @Expose
    Story story;

    public String get_id() {
        return _id;
    }

    public String getUsername() {
        return username;
    }

    public String getStoryname() {
        return storyname;
    }

    public Story getStory() {
        return story;
    }

    public User getUser() {
        return user;
    }
}
