package CaseStudy.services.Impl;

import CaseStudy.models.Customer;
import CaseStudy.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    private static List<Customer> customerList = new LinkedList<>();
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customerList.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Input sex: ");
        String sex = scanner.nextLine();
        System.out.println("Input idCard: ");
        String idCard = scanner.nextLine();
        System.out.println("Input phone number: ");
        int phone = Integer.parseInt(scanner.nextLine());
        System.out.println("Input email: ");
        String email = scanner.nextLine();
        System.out.println("Input Customer Type: ");
        String typeCustomer = scanner.nextLine();
        System.out.println("Input address: ");
        String address = scanner.nextLine();
        Customer customer = new Customer(id, name, age, sex, idCard, phone, email, typeCustomer, address);
        customerList.add(customer);
        System.out.println("Add new customer sucessfully");
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
