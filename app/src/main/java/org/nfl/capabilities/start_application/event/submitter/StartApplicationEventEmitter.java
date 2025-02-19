package org.nfl.capabilities.start_application.event.submitter;

import org.nfl.capabilities.start_application.event.StartApplicationEvent;
import org.nfl.capabilities.start_application.event.interested.party.StartApplicationInterestedParty;

import java.util.ArrayList;
import java.util.Collection;

public final class StartApplicationEventEmitter {
    private final Collection<StartApplicationInterestedParty> interestedParties = new ArrayList<>();

    public void emit(StartApplicationEvent event) {
        interestedParties.forEach(interestedParty -> interestedParty.onEventEmission(event));
    }

    public void register(StartApplicationInterestedParty interestedParty) {
        interestedParties.add(interestedParty);
    }

    public void unregister(StartApplicationInterestedParty interestedParty) {
        interestedParties.remove(interestedParty);
    }
}
