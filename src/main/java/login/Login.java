package login;

import enums.UserType;
import user.User;

import java.util.List;

public class Login {
    private List<User> users;

    private void newUser(User user){
        this.users.add(user);
    }

    private boolean deleteUser(User user, User admin){
        if (admin.getRole().equals(UserType.ADMIN)){
            System.out.println("Usuario deletado com sucesso!");
           return users.remove(user);
        }
        System.out.println("Usuario nao foi deletado");
        return false;
    }

    public boolean login(User user){
        // User is Logged
        if (user.isUserLogged()){
            return true;
        }

        // User alredy exist
         var users1 = users.stream()
                    .filter(nick -> nick.getNickname().equals(user.getNickname()))
                    .filter(pass -> pass.getPassword().equals(user.getPassword()))
                    .findAny();

        // User is Logged - desafio: como tornar o userLogged privado? jeito de modificar o setUserLogged()
        boolean userExists = users1.isPresent();
        if (userExists) {
            user.setUserLogged(true);
        }

        return userExists;
    }
}
