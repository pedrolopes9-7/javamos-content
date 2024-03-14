package catalog;

import user.User;

import java.util.List;
import java.util.stream.Collectors;

public class Catalog {
    public List<Announcement> announcements;

    public List<Announcement> getAnnouncements() {
        return announcements;
    }

    public boolean addProductSale(Announcement announcement){
        if(announcement.getSeller() != null){
            System.out.println("product not add in sale");
            return false;
        }
        System.out.println("product add in sale");
        return this.announcements.add(announcement);
    }

    public List<Announcement> searchProductByName(String product){
        return announcements.stream()
                .filter(x -> x.getProduct().name.equalsIgnoreCase(product))
                .collect(Collectors.toList());
    }

    public List<Announcement> searchProductByCategory(String category){
        return announcements.stream()
                .filter(x -> x.getProduct().category.equalsIgnoreCase(category))
                .collect(Collectors.toList());
    }
}
