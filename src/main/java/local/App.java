package local;

import local.event.Event;
import local.logger.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class App {

    private Client client;
    private EventLogger eventLogger;

    App(Client client, EventLogger eventLogger) {
        this.client = client;
        this.eventLogger = eventLogger;
    }

    public void logEvent(Event event) {
        eventLogger.logEvent(event);
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        Event customEvent = new Event(new Date(), DateFormat.getDateTimeInstance());
        customEvent.setMsg("My message!");

        app.logEvent(new Event(new Date(), DateFormat.getDateTimeInstance()));
        app.logEvent(new Event(new Date(), DateFormat.getDateInstance(1)));
        app.logEvent(customEvent);
        app.logEvent(new Event(new Date(), DateFormat.getDateTimeInstance()));
        app.logEvent(new Event(new Date(), DateFormat.getDateInstance(3)));

        ConfigurableApplicationContext context = (ConfigurableApplicationContext) ctx;
        context.close();
    }
}
