package purchase;

import product.Product;
import user.User;

import java.util.List;

public class Purchase {

    private User buyer;

    private User seller;

    private List<Product> products;

    private PaymentMethod paymentMethod;
}
