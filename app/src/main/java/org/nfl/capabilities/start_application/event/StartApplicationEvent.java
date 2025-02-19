package org.nfl.capabilities.start_application.event;

import org.nfl.capabilities.start_application.event.model.app.App;
import org.nfl.capabilities.start_application.event.model.user.User;

public record StartApplicationEvent(App app, User user) {
    public static StartApplicationEvent event(App app, User user){
        return new StartApplicationEvent(app,user);
    }
}
