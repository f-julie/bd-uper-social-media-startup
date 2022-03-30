import java.util.Arrays;
import java.util.List;

public class Account {
    private AccountDetails details;
    private List<Message> messages;

    public Account(AccountDetails details, Message[] messages) {
        this.details = details;
        this.messages = Arrays.asList(messages);
    }

    public AccountDetails getDetails() {
        return details;
    }

    public Message[] getMessages() {
        return (Message[]) messages.toArray();
    }

    public void addMessage(Message m) {
        messages.add(m);
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("User: " + details.getLoginInfo().getUsername() + "\n");
        result.append("Messages (" + messages.size() + ")\n");
        for (Message m : messages) {
            result.append(m.toString() + "\n");
        }

        return result.toString();
    }
}
