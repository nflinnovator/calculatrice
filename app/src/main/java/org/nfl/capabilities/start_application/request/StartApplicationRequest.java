package org.nfl.capabilities.start_application.request;

import org.nfl.capabilities.start_application.request.model.app.App;
import org.nfl.capabilities.start_application.request.model.user.User;

public record StartApplicationRequest(App app, User user) {
    public static StartApplicationRequest request(App app, User user){
        return new StartApplicationRequest(app,user);
    }
}
