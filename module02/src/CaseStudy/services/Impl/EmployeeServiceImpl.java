package CaseStudy.services.Impl;

import CaseStudy.models.Employee;
import CaseStudy.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employeeList.toString());
        }
    }

    @Override
    public void addNew() {
        System.out.println("Input ID: ");
        int id = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Input name: ");
        String name = scanner.nextLine();
        System.out.println("Input age: ");
        int age = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Input sex: ");
        String sex = scanner.nextLine();
        System.out.println("Input idCard: ");
        String idCard = scanner.nextLine();
        System.out.println("Input phone number: ");
        int phone = Integer.parseInt(scanner.nextLine()) ;
        System.out.println("Input email: ");
        String email = scanner.nextLine();
        System.out.println("Input level: ");
        String level = scanner.nextLine();
        System.out.println("Input position: ");
        String position = scanner.nextLine();
        System.out.println("Input salary:");
        int salary = Integer.parseInt(scanner.nextLine()) ;
        Employee employee = new Employee(id, name, age, sex, idCard, phone, email, level, position, salary);
        employeeList.add(employee);
    }

    @Override
    public void edit() {

    }

    @Override
    public void delete() {

    }
}
