package org.nfl.capabilities.start_application.unit.event.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.nfl.capabilities.start_application.event.StartApplicationEvent.event;
import static org.nfl.capabilities.start_application.event.factory.StartApplicationEventFactory.makeEventFrom;
import static org.nfl.capabilities.start_application.event.model.app.App.app;
import static org.nfl.capabilities.start_application.event.model.user.User.user;

final class StartApplicationEventFactoryTests {
    private static final String APP_PARAMS = "id:\"appID\",name:\"Pass Exam\"", USER_PARAMS = "id:\"userID\",name:\"Joakim\"";
    @Test
    void should_make_expected_request() {
        final var parameters = new String[]{APP_PARAMS, USER_PARAMS};
        assertEquals(event(app("appID", "Pass Exam"), user("userID", "Joakim")), makeEventFrom(parameters));
    }
}
