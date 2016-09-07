package local.logger.impl;

import local.event.Event;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class CacheFileEventLogger extends FileEventLogger {

    private int cacheSize;
    private List<Event> cache;

    public CacheFileEventLogger(String fileName, int cacheSize) {
        super(fileName);
        this.cacheSize = cacheSize;
        this.cache = new ArrayList<Event>();
    }

    @Override
    public void logEvent(Event event) {
        cache.add(event);
        if (cache.size() == cacheSize) {
            for (Event e : cache)
                super.logEvent(e);
            cache.clear();
        }
    }

    public void destroy() {
        System.out.println("after destroy:" + cache.size());
        if (!cache.isEmpty()) {
            for (Event e : cache)
                super.logEvent(e);
        }
    }
}
