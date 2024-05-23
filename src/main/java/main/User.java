package main;

import enums.UserType;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class User {
    protected Long id;
    protected String nickname;
    protected String email;
    protected String password;
    protected UserType role;
    private boolean userLogged;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getRole() {
        return role;
    }

    public void setRole(UserType role) {
        this.role = role;
    }

    public boolean isUserLogged() {
        return userLogged;
    }

    public void setUserLogged(boolean userLogged) {
        this.userLogged = userLogged;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return id == user.id && name.equals(user.name) && password.equals(user.password) && Objects.equals(productForSale, user.productForSale);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, password, productForSale);
    }

    private String name;

    private List<Product> productForSale;

    public User(String nome, String password) {
        this.name = name;
        this.password = password;
        this.productForSale = new ArrayList<>();
    }


    // Encontrar produtos para venda
    public List<Product> getProductForSale() {
        return productForSale;
    }

    // Selecionar produtos para vender
    public void setProductForSale(List<Product> productForSale) {
        this.productForSale = productForSale;
    }

    // Adicionar produtos para vender
    public void addProduct(Product product) {
        productForSale.add(product);
    }
}
