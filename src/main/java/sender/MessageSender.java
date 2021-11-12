package sender;

public class MessageSender {
    public String send(String text, User user, String country) {
        if (user.getCountry().equals(country)) {
            return text;
        }
        return null;
    }
}
