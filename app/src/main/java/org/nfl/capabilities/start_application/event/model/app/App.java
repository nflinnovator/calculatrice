package org.nfl.capabilities.start_application.event.model.app;

public record App(String id,String name) {
    public static App app(String id,String name){
        return new App(id,name);
    }
}
