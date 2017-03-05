package mit.basil.ravi.unsolved;

/**
 * Created by RB on 03-Mar-17.
 */

public class User {
    public String name;
    public String email;

    //Default contructor required for calls // TODO: 03-Mar-17
    //DataSnapshot.getValue(User.class)
    public User() {
    }

    public User(String name, String email)
    {
        this.name = name;
        this.email = email;
    }
}
