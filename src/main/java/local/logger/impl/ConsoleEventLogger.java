package local.logger.impl;

import local.event.Event;
import local.logger.*;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class ConsoleEventLogger implements EventLogger {
    public void logEvent(Event event) {
        System.out.println("logger:{" + event + "}");
    }
}
