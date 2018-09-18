package eric.weatherprediction;

import com.google.firebase.database.IgnoreExtraProperties;

@IgnoreExtraProperties
public class User {

    public String username;
    public int count;

    public User() {

    }

    public User(String username, int count) {
        this.username = username;
        this.count = count;
    }

}


