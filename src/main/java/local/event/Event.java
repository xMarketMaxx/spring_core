package local.event;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class Event {
    private int id;
    private String msg;
    private Date date;
    private DateFormat df;

    public Event(Date date, DateFormat df) {
        this.date = date;
        this.df = df;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public static boolean isDay() {
        Date date = new Date();
        Long hours = date.getTime() % (24 * 3600);
        return (hours / 3600) >= 8 && (hours / 3600) <= 17 ? true : false;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", msg='" + msg + '\'' +
                ", date=" + df.format(date) +
                '}';
    }
}
