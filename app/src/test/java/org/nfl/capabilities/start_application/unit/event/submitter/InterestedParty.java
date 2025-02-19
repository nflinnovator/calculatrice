package org.nfl.capabilities.start_application.unit.event.submitter;

import org.nfl.capabilities.start_application.event.StartApplicationEvent;
import org.nfl.capabilities.start_application.event.interested.party.StartApplicationInterestedParty;

final class InterestedParty implements StartApplicationInterestedParty {
    private StartApplicationEvent event;

    public boolean hasReceived(StartApplicationEvent request) {
        return this.event.equals(request);
    }

    @Override
    public void onEventEmission(StartApplicationEvent event) {
        this.event = event;
    }
}
