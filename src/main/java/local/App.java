package local;

import local.event.Event;
import local.logger.EventLogger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.DateFormat;
import java.util.Date;
import java.util.Map;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class App {

    private Client client;
    private EventLogger eventLogger;
    private Map<EventType, EventLogger> loggers;

    App(Client client, EventLogger eventLogger) {//, Map<EventType//, EventLogger> loggers) {
        this.client = client;
        this.eventLogger = eventLogger;
//        this.loggers = loggers;
    }

    public void logEvent(EventType type, String msg) {
//        EventLogger logger = loggers.get(type);
//        if (logger == null) {
//            logger = eventLogger;
//        }
        EventLogger logger = eventLogger;
        Event event = new Event(new Date(), DateFormat.getDateInstance(1));
        event.setMsg(msg);
        logger.logEvent(event);
    }

    public Client getClient() {
        return this.client;
    }

    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
        App app = (App) ctx.getBean("app");

        for (int i = 0; i < 10; i++)
            app.logEvent(EventType.ERROR, "My message error:" + i);

        for (int i = 0; i < 5; i++)
            app.logEvent(EventType.INFO, "My console message:" + i);

        app.logEvent(EventType.ERROR, app.getClient().toString());

        ConfigurableApplicationContext context = (ConfigurableApplicationContext) ctx;
        context.close();
    }
}
