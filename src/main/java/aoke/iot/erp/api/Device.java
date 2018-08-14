package aoke.iot.erp.api;

public class Device {

    private final long id;
    private final String content;

    public Device(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

}
