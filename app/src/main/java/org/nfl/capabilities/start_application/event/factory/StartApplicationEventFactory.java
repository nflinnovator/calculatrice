package org.nfl.capabilities.start_application.event.factory;

import org.nfl.capabilities.start_application.event.StartApplicationEvent;

import static org.nfl.capabilities.start_application.event.StartApplicationEvent.event;
import static org.nfl.capabilities.start_application.event.model.app.App.app;
import static org.nfl.capabilities.start_application.event.model.user.User.user;

public final class StartApplicationEventFactory {
    public static StartApplicationEvent makeEventFrom(String[] parameters) {
        return event(app("appID","Pass Exam"), user("userID","Joakim"));
    }
}
