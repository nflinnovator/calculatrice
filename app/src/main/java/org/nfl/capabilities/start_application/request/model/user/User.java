package org.nfl.capabilities.start_application.request.model.user;

public record User(String id,String name) {
    public static User user(String id,String name){
        return new User(id, name);
    }
}
