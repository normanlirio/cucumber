package objects;

import java.util.ArrayList;

public class UserCredentials {

    private String email;
    private String password;

    private ArrayList<UserCredentials> list;

    public UserCredentials(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public UserCredentials() {}
    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
