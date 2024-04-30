package catalog;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Catalog {
    public List<Announcement> announcements;

    public List<Announcement> getAnnouncements() {
        return announcements;
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

    public boolean addProductSale(Announcement announcement){
        if(announcement.getSeller() == null){
            System.out.println("product not add in sale");
            return false;
        }
        System.out.println("product add in sale");
        return this.announcements.add(announcement);
    }

    public void addingQuantity(Long id, int quantity){
        Optional<Announcement> announcement = announcements.stream().filter( x -> x.getId().equals(id)).findFirst();
        announcement.ifPresent(value -> value.setQuantity(value.getQuantity() + quantity));
    }

    public void removingQuantity(Long id, int quantity){
        Optional<Announcement> announcement = announcements.stream().filter( x -> x.getId().equals(id)).findFirst();
        announcement.ifPresent(value -> value.setQuantity(value.getQuantity() - quantity));
    }

}
