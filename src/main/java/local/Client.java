package local;

/**
 * Created by Maksym_Pinchuk on 9/7/2016.
 */
public class Client {
    private String id;
    private String fullName;
    private String greeting;

    public Client(String id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGreeting() {
        return greeting;
    }

    public void setGreeting(String greeting) {
        this.greeting = greeting;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("id: ").append(id);
        sb.append(" fullName: ").append(fullName);
        sb.append(" greeting: ").append(greeting);
        return sb.toString();
    }
}
