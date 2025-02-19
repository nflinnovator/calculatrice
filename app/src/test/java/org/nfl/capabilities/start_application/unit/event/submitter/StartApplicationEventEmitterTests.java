package org.nfl.capabilities.start_application.unit.event.submitter;

import org.junit.jupiter.api.Test;
import org.nfl.capabilities.start_application.event.StartApplicationEvent;
import org.nfl.capabilities.start_application.event.submitter.StartApplicationEventEmitter;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.nfl.capabilities.start_application.event.model.app.App.app;
import static org.nfl.capabilities.start_application.event.model.user.User.user;

final class StartApplicationEventEmitterTests {
    @Test
    void should_emit_start_application_event_to_the_registered_interested_party(){
        final var submitter = new StartApplicationEventEmitter();
        final var interestedParty = new InterestedParty();
        submitter.register(interestedParty);

        final var request = StartApplicationEvent.event(app("appID","Exam Preparation Centre"), user("userID","Joakim"));
        submitter.emit(request);

        assertTrue(interestedParty.hasReceived(request));

        submitter.unregister(interestedParty);
    }
}
