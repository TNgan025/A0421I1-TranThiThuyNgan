package service;

import model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    //    Các thuộc tính của sản phẩm bao gồm: id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất
    private static Map<Integer, Product> products;

    static {
        products = new HashMap<>();
        products.put(1, new Product(1, "Nokia", 700, "Nokia 9900","Nokia"));
        products.put(2, new Product(2, "Iphone", 1200, "Iphone 12","Apple"));
        products.put(3, new Product(3, "Samsung", 800, "Samsung S20","Samsung"));
    }
    @Override
    public List<Product> findAll() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void save(Product product) {
        products.put(product.getID(),product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }

    @Override
    public void update(int id, Product product) {
    products.put(id,product);
    }

    @Override
    public void remove(int id) {
    products.remove(id);
    }
}
