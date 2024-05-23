package main;

import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    private Long id;
    private Announcement announcement;
    private double totalCart;
    private List<Announcement> shoppingCart;

    void addItemInShoppingCart(Announcement announcement) {
        this.shoppingCart.add(announcement);
    }

    void removeItemInShoppingCart(Announcement announcement) {
        this.shoppingCart.remove(announcement);
    }

    Optional<Announcement> updateItemInShoppingCart(Announcement announcement, int quantity) {
        var item = shoppingCart.stream()
                .filter(x -> x.getProduct().equals(announcement.getProduct())).findFirst();
        item.get().setQuantity(quantity);
        return item;
    }
}
