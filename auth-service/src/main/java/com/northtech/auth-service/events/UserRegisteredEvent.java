package com.northtech.auth.events;

import com.northtech.auth.domain.User;

public class UserRegisteredEvent {
    private User user;

    public UserRegisteredEvent() {}
    public UserRegisteredEvent(User user) { this.user = user; }

    public User getUser() { return user; }
    public void setUser(User user) { this.user = user; }
}
