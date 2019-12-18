package com.example.coolchat.model;

public class User {
    private String name;
    private String email;
    private String id;
    private int avatarUserMockUpResource;

    public User() {
    }

    public User(String name, String email, String id, int avatarUserMockUpResource) {
        this.name = name;
        this.email = email;
        this.id = id;
        this.avatarUserMockUpResource = avatarUserMockUpResource;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getAvatarUserMockUpResource() {
        return avatarUserMockUpResource;
    }

    public void setAvatarUserMockUpResource(int avatarUserMockUpResource) {
        this.avatarUserMockUpResource = avatarUserMockUpResource;
    }
}
