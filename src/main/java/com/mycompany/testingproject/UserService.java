package com.mycompany.testingproject;

import java.util.HashMap;

public class UserService {
    private HashMap<Long, UserDto> users = new HashMap<Long, UserDto>();
    
    public UserDto updateUser(Long id, String name) {
        UserDto existingUser = this.users.get(id);
        existingUser.setName(name);
        return this.users.put(id, existingUser);
    }
    
    public UserDto getUser(Long id) {
        return this.users.get(id);
    }
    
    public UserDto createUser(Long id, String name) {
        UserDto user = new UserDto();
        user.setId(id);
        user.setName(name);
        this.users.put(id, user);
        return user;
    }
}
