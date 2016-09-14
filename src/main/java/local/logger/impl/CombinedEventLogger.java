package local.logger.impl;

import local.event.Event;
import local.logger.EventLogger;

import java.util.Collection;

/**
 * Created by Maksym_Pinchuk on 9/13/2016.
 */
public class CombinedEventLogger implements EventLogger{

    private Collection<EventLogger> loggers;

    public CombinedEventLogger(Collection<EventLogger> loggers){
        this.loggers = loggers;
    }

    public void logEvent(final Event event) {
        loggers.forEach(e->{e.logEvent(event);});
    }
}
