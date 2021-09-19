//package b12_map_tree.bai_tap.ArrayList_LinkedList;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class ProductManager {
//    //    public String ID;
////    public String name;
////    public Integer price;
//    private static List<Product> productLíst;
//    private static Scanner scanner = new Scanner(System.in);
//
//    static {
//        productLíst = new ArrayList<>();
//        productLíst.add(new Product(1, "Pen", 5000));
//        productLíst.add(new Product(2, "Paper", 10000));
//        productLíst.add(new Product(3, "Pencil", 3000));
//    }
//
//    public static void displaymenu() {
//
//
//        System.out.println("Menu");
//        System.out.println("1. Add new product");
//        System.out.println("2. Change product");
//        System.out.println("3. Delete product-Input ID");
//        System.out.println("4. Display product list");
//        System.out.println("5. Find product-Input name");
//        System.out.println("6. Sort product-Price increase");
//        System.out.println("8. Sort product-Price decrease");
//        System.out.println("Enter your choice: ");
//        Integer choice = scanner.nextInt();
//        switch (choice) {
//            case 1:
//                Integer ID;
//                System.out.println("Add ID");
//                ID = scanner.nextInt();
//                String name;
//                System.out.println("Add name");
//                name = scanner.nextLine();
//                int price;
//                System.out.println("Add price");
//                price = scanner.nextInt();
//                Product product = new Product(ID, name, price);
//                productLíst.add(product);
//                break;
//            default:
//                System.out.println("No choice!");
//                break;
//        }
//    }
//
//    public static void main(String[] args) {
//
//    }
//}
