package catalog;

import product.Product;
import user.User;

public class Announcement {
    private Long id;
    private Product product;
    private Double price;
    private String title;
    private String description;
    private boolean hasStockAvailable;
    private Integer quantity;
    private User seller;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHasStockAvailable() {
        return hasStockAvailable;
    }

    public void setHasStockAvailable(boolean hasStockAvailable) {
        this.hasStockAvailable = hasStockAvailable;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }
}
