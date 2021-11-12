package sender;

import facebook.FacebookUser;
import twitter.TwitterUser;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class MessageSenderTest {
    private MyFacebookUser fbUser;
    private MyTwitterUser twitterUser;
    private MessageSender ms;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.fbUser = new MyFacebookUser(new FacebookUser("some@gmail.com", "USA", new Date()));
        this.twitterUser = new MyTwitterUser(new TwitterUser("some@gmail.com", "Ukraine", new Date()));
        this.ms = new MessageSender();
    }

    @org.junit.jupiter.api.Test
    void sendFB() {
        assertEquals("text_1", ms.send("text_1", fbUser, "USA"));
    }

    @org.junit.jupiter.api.Test
    void sendTwitter() {
        assertEquals("text_2", ms.send("text_2", twitterUser, "Ukraine"));
    }
}