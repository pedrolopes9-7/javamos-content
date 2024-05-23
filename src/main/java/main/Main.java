package main;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        UserRepository userRepository = null;

        User user = null;
        Product product = null;
        Catalog catalog = null;

        // Criando usuários
        User user1 = new User("João", "senha123");
        User user2 = new User("Maria", "senha456");

        // Adicionando usuários
        userRepository.addUser(user1);
        userRepository.addUser(user2);

        // Criando produtos
        Product product1 = new Product("Celular", "Eletrônicos", 35, 1500.00);
        Product product2 = new Product("Notebook", "Eletrônicos", 12,3000.00);
        Product product3 = new Product("Camiseta", "Moda", 65, 50.00);

        // Adicionando produtos ao sistema
        catalog.addProduct(product1);
        catalog.addProduct(product2);
        catalog.addProduct(product3);

        // Pesquisar produtos por nome
        List<Product> searchProduct = catalog.searchProductByName("Celular");
        System.out.println("Produtos encontrados por nome 'Celular':");
        for (Product product4 : searchProduct) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }

        // Pesquisar produtos por categoria
        searchProduct = catalog.searchProductByCategory("Eletrônicos");
        System.out.println("Produtos encontrados na categoria 'Eletrônicos':");
        for (Product product4 : searchProduct) {
            System.out.println(product.getName() + " - " + product.getPrice());
        }
    }
}
