package kailin.eventreporter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by kailin on 12/4/17.
 */

public class DataService {
    /**
     * Fake all the event data for now. We will refine this and connect
     * to our backend later.
     */
    public static List<Event> getEventData() {
        List<Event> eventData = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            eventData.add(
                    new Event("Event", "1184 W valley Blvd, CA 90101",
                            "This is a huge event"));
        }
        return eventData;
    }
}
