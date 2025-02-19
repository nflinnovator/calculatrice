package org.nfl.capabilities.start_application.request.factory;

import org.nfl.capabilities.start_application.request.StartApplicationRequest;

import static org.nfl.capabilities.start_application.request.StartApplicationRequest.request;
import static org.nfl.capabilities.start_application.request.model.app.App.app;
import static org.nfl.capabilities.start_application.request.model.user.User.user;

public final class StartApplicationRequestFactory {
    public static StartApplicationRequest makeRequestFrom(String[] parameters) {
        return request(app("appID","Pass Exam"), user("userID","Joakim"));
    }
}
