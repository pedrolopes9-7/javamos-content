package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Catalog {

    public List<Announcement> announcements;

    public List<Product> products;


    public Catalog(Announcement announcements, List<User> user, List<Product> product) {
        this.announcements = (List<Announcement>) announcements;
        this.products = new ArrayList<>();
    }


    // Adicionar produtos
    public void addProduct(Product product) {
        addProduct(product);
        System.out.println("Produto adicionado.");
    }

    // Remover produtos
    public void removeProduct(Product product) {
        removeProduct(product);
        System.out.println("Produto removido.");
    }

    // Modificar produtos
    public void updateProduct(Product product) {
        updateProduct(product);
        System.out.println("Produto removido.");
    }


    // Pesquisar produtos por nome
    public List<Product> searchProductByName(String name) {
        List<Product> searchProductByName = new ArrayList<>();
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                searchProductByName.add(product);
            }
        }
        return searchProductByName;
    }

    // Pesquisar produtos por categoria
    public List<Product> searchProductByCategory(String category) {
        List<Product> searchProductByCategory = new ArrayList<>();
        for (Product product : products) {
            if (product.getCategory().equalsIgnoreCase(category)) {
                searchProductByCategory.add(product);
            }
        }
        return searchProductByCategory;
    }

    //Adicionar anuncio de produto
    public boolean addProductSale(Announcement announcement) {
        if(announcement.getSeller() != null) {
            System.out.println("Product not add in sale.");
            return false;
        }
        System.out.println("Product add in sale.");
        return this.announcements.add(announcement);
    }

    //Adicionar quantidade de produtos do anuncio
    public void addQuantity(Long id, Integer quantity) {
        Optional<Announcement> announcement = announcements.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst();
        announcement.ifPresent(value -> value.setQuantity(value.getQuantity() + quantity));
    }

    //Remover quantidade de produtos do anuncio
    public void removeQuantity(Long id, Integer quantity) {
        Optional<Announcement> announcement = announcements.stream()
                .filter(x -> x.getId().equals(id))
                .findFirst();
        announcement.ifPresent(value -> value.setQuantity(value.getQuantity() - quantity));
    }
}
