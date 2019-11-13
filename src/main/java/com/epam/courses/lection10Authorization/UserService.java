package com.epam.courses.lection10Authorization;

import java.util.HashMap;
import java.util.Map;

public class UserService {
    
    private static Map<String, User> userMap = new HashMap<>();
    static {
        userMap.put("admin", new User(1, "admin", "nimda", "Admin"));
        userMap.put("user1", new User(2, "user1", "nimda", "User 1"));
        userMap.put("user2", new User(3, "user2", "nimda", "User 2"));
    }
    
    public boolean validateUser(String login, String password){
        User user = userMap.get(login);
        if(user == null){ 
            return false;
        }
        
        return user.getPassword().equals(password);
    }
    
    public User getUser(String login){
        return userMap.get(login);
    }
}
