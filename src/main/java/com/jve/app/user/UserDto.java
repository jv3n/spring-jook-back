package com.jve.app.user;

public class UserDto {
    private Long id;
    private String name;
    private String email;

    public UserDto() {/* empty */}

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setId(Long id) {
        this.id = id;
        return this;
    }

    public UserDto setName(String name) {
        this.name = name;
        return this;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }
}
