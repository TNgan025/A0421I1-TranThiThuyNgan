package b12_map_tree.bai_tap.ArrayList_LinkedList;

public class ProductNotFoundException extends Exception {
    public ProductNotFoundException(String message) {
        super(message);
    }

    public ProductNotFoundException() {
        super("Product not found");
    }
}
