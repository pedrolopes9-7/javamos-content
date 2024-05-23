package main;

import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    public List<User> users = new ArrayList<>();

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // Adicionar usuários
    public void addUser(User user) {
        users.add(user);
        System.out.println("Usuário adicionado.");
    }

    public void listUser() {
        users.add(new User( "joaodasilva", "123456"));
        users.add(new User( "mariadasilva", "654321"));
    }

    public boolean login(User user) {
        return user != null && users.contains(user);
    }
}
