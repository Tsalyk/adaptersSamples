package sender;

import facebook.FacebookUser;

import java.util.Date;

public class MyFacebookUser implements User {
    private FacebookUser user;

    public MyFacebookUser(FacebookUser user) {
        this.user = user;
    }

    @Override
    public String getMail() {
        return user.getEmail();
    }

    @Override
    public String getCountry() {
        return user.getUserCountry();
    }

    @Override
    public Date getLastActiveTime() {
        return user.getUserActiveTime();
    }
}
