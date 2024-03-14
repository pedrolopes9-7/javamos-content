package login;

import user.User;

import java.util.List;

public class Login {
    private List<User> users;

    public boolean newUser(User user){

        return this.users.add(user);
    }

    public boolean validateUser(User user){
        if(user.getId() == null ||
        user.getNickname() == null){
            return false;
        }
        return true;
    }
}
