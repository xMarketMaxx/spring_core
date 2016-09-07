package local.logger;

import local.event.Event;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public interface EventLogger {
    void logEvent(Event event);
}
