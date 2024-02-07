package product;

import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public final class ProductCatalog {
    private static final ProductCatalog INSTANCE = new ProductCatalog();

    private final List<Product> allProducts;

    public static ProductCatalog getCatalog() {
        return INSTANCE;
    }

    private ProductCatalog() {
        this.allProducts = new ArrayList<>();
    }

    public List<Product> getAllProducts() {
        return INSTANCE.allProducts;
    }

    public List<Product> getProductsByName(final String name) {
        return allProducts.stream()
                .filter(prod -> name.equals(prod.getName()))
                .collect(toList());
    }

    public List<Product> getProductByCategory(final String category) {
        return allProducts.stream()
                .filter(prod -> category.equals(prod.getCategory()))
                .collect(toList());
    }

    public boolean add(Product product) {
        if (product.getName() == null) {
            throw new IllegalStateException("Parameter 'product.name' should not be null");
        }

        if (product.getCategory() == null) {
            throw new IllegalStateException("Parameter 'product.category' should not be null");
        }

        return INSTANCE.allProducts.add(product);
    }
}
