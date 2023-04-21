package product1.services;

import product1.model.Farm;

import java.util.List;

public interface IProductService {
    void add(Farm newFarm);

    void update(int id, Farm updateFarm);

    List<Farm> getProducts();

    void updateQuantity(int id, int quantity);

}
