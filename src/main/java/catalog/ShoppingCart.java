package catalog;

import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    //- Um usuário pode adicionar/remover/modificar itens de produtos em seu carrinho de compras.

    private Long id;
    private Announcement announcements;
    private List<Announcement> shoppingCart;
    private double totalCart;

    public void addItemShoppingCart(Announcement announcement){
        this.shoppingCart.add(announcement);
    }

    public void removeItemShoppingCart(Announcement announcement){
        this.shoppingCart.remove(announcement);
    }

    public Optional<Announcement> updateItemShoppingCart(Announcement announcement, int quantity){
        Optional<Announcement> item = this.shoppingCart.stream().filter(x -> x.getProduct().equals(announcement.getProduct())).findFirst();

        item.get().setQuantity(quantity); //.map(announcement::setQuantity(quantity))
        return item;
    }

}
