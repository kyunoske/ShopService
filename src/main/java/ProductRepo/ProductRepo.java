package ProductRepo;

import model.Product;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class ProductRepo {

    //products
    private Map<Integer, Product> products = new HashMap<>();

    public ProductRepo() {

    }
    //list()
    public Map<Integer, Product> getAllProducts() {
        return this.products;
    }
    //get()
    public Product getProduct(Integer productId) {
        return products.get(productId);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }

    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }
}
