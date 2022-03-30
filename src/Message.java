public class Message {
    private TimeStamp timestamp;
    private String text;

    public Message(TimeStamp timestamp, String text) {
        this.timestamp = timestamp;
        this.text = text;
    }

    public TimeStamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(TimeStamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getMessage() {
        return text;
    }

    public void setMessage(String message) {
        this.text = message;
    }

    @Override
    public String toString() {
        return timestamp + ": " + text;
    }
}

