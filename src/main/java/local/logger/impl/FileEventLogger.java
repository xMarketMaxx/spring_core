package local.logger.impl;

import local.event.Event;
import local.logger.EventLogger;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class FileEventLogger implements EventLogger {
    private String fileName;
    private File file;

    public FileEventLogger(String fileName) {
        this.fileName = fileName;
    }

    /**
     * add record to file
     */
    public void logEvent(Event event) {
        try {
            FileUtils.writeStringToFile(new File(fileName), event.toString()+"\n", "UTF-8", true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Init method for spring
     */
    private void init() throws IOException {
        file = new File(fileName);
        if (!file.canWrite())
            throw new IOException("can't write to file!");
    }

}
