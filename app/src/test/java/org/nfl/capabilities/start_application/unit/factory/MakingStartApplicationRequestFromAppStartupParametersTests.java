package org.nfl.capabilities.start_application.unit.factory;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.nfl.capabilities.start_application.request.StartApplicationRequest.request;
import static org.nfl.capabilities.start_application.request.factory.StartApplicationRequestFactory.makeRequestFrom;
import static org.nfl.capabilities.start_application.request.model.app.App.app;
import static org.nfl.capabilities.start_application.request.model.user.User.user;

final class MakingStartApplicationRequestFromAppStartupParametersTests {
    private static final String APP_PARAMS = "id:\"appID\",name:\"Pass Exam\"", USER_PARAMS = "id:\"userID\",name:\"Joakim\"";
    @Test
    void should_make_expected_request() {
        final var parameters = new String[]{APP_PARAMS, USER_PARAMS};
        assertEquals(request(app("appID", "Pass Exam"), user("userID", "Joakim")), makeRequestFrom(parameters));
    }
}
