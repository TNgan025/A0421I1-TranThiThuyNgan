package b12_map_tree.bai_tap.ArrayList_LinkedList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class ProductManager {
    public static void main(String[] args) {
        displaymenu();
    }

    private static List<Product> productLíst = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    static {
        productLíst.add(new Product(1, "Pen", 5000));
        productLíst.add(new Product(2, "Paper", 10000));
        productLíst.add(new Product(3, "Pencil", 3000));
    }

    public static void displaymenu() {
        System.out.println("Menu");
        System.out.println("1. Add new product");
        System.out.println("2. Change product");
        System.out.println("3. Delete product-Input ID");
        System.out.println("4. Display product list");
        System.out.println("5. Find product-Input name");
        System.out.println("6. Sort product-Price increase");
        System.out.println("7. Sort product-Price decrease");
        System.out.println("Enter your choice: ");
        Integer choice = scanner.nextInt();
        switch (choice) {
            case 1:
                addNew();
                break;
            case 2:
                break;
            case 3:
                deleteProduct();
                break;
            case 4:
                for (Product product : productLíst) {
                    System.out.println(product.toString());
                }
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            default:
                System.out.println("No choice!");
                break;
        }
    }

    public static void addNew() {
      Scanner scanner = new Scanner(System.in);
     int ID = -1;
     if(productLíst.isEmpty()){
         ID = 1;
     }
     else {
         ID = productLíst.get(productLíst.size()-1).getID()+1;
     }
        System.out.println("Add name: ");
        String name = scanner.nextLine();

        System.out.println("Add price: ");
        int price = Integer.parseInt(scanner.nextLine());
        Product product = new Product(ID, name, price);

        System.out.println("Add new product sucessfully");
    }

//    public static void changeProduct() {
//
//    }

    public static void deleteProduct() {
        try {
            System.out.println("Input ID of product need to delete");
            int ID = Integer.parseInt(scanner.nextLine());
            Product product = findbyID(ID);
            System.out.println("Are you sure to delete product " + product.getName() +
                    "\n Yes" +
                    "\n No");
            if (scanner.nextLine().equals("Yes")) {
                productLíst.remove(product);
            } else {
                displaymenu();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Product findbyID(int ID) throws ProductNotFoundException {
        Product product = null;
        for (int i = 0; i < productLíst.size(); i++) {
            if (productLíst.get(i).getID() == ID) {
                product = productLíst.get(i);
            }
        }
        if (product == null) {
            throw new ProductNotFoundException("Product not found");
        }
        return product;
    }

}
