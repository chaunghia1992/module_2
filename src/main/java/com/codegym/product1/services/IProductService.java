package product1.services;

import product1.model.Product;

import java.util.List;

public interface IProductService {
    void add(Product newProduct);

    void update(int id, Product updateProduct);

    List<Product> getProducts();

    void updateQuantity(int id, int quantity);

}
