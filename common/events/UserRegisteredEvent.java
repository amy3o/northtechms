package com.northtech.common.events;

import com.northtech.common.dto.UserDto;

public class UserRegisteredEvent {
    private UserDto user;

    public UserRegisteredEvent() {}

    public UserRegisteredEvent(UserDto user) {
        this.user = user;
    }

    public UserDto getUser() { return user; }
    public void setUser(UserDto user) { this.user = user; }
}
