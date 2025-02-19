package org.nfl.capabilities.start_application.event.interested.party;

import org.nfl.capabilities.start_application.event.StartApplicationEvent;

public interface StartApplicationInterestedParty {
    void onEventEmission(StartApplicationEvent event);
}
