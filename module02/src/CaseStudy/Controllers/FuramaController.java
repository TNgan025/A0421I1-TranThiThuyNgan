package CaseStudy.Controllers;

import CaseStudy.services.EmployeeService;
import CaseStudy.services.Impl.*;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }

    public int choice;

    public static void displayMainMenu() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Menu");
        System.out.println("1. Employee Management");
        System.out.println("2. Customer Management");
        System.out.println("3. Facility Management");
        System.out.println("4. Booking Managerment");
        System.out.println("5. Promotion Management");
        System.out.println("6. Exit");
        System.out.println("Enter your choice: ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: {
                displayEmployeeMenu();
                break;
            }
            case 2: {
                displayCustomerMenu();
                break;
            }
            case 3:
                displayFacilityMenu();
                break;
            case 4:
                displayBookingMenu();
                break;
            case 5:
                System.out.println("1. Display customers use service");
                System.out.println("3. Display list customers get voucher");
                System.out.println("4. Return main menu");
                break;
            case 6:
                System.exit(6);
                break;
            default:
                System.out.println("No choice!");
                break;
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        System.out.println("1. Display list employees");
        System.out.println("2. Add new employee");
        System.out.println("3. Edit employee");
        System.out.println("4. Return main menu");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                employeeService.display();
                break;
            case 2:
                employeeService.addNew();
                break;
            case 3:
                employeeService.edit();
                break;
            case 4:
                displayMainMenu();
                break;
            default:
                System.out.println("No choice!");
                break;
        }
    }

    public static void displayCustomerMenu() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        System.out.println("1. Display list customers");
        System.out.println("2. Add new customer");
        System.out.println("3. Edit customer");
        System.out.println("4. Return main menu");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                customerService.display();
                break;
            case 2:
                customerService.addNew();
                break;
            case 3:
                customerService.edit();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }

    public static void displayFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1. Display facility");
        System.out.println("2. Add new facility");
        System.out.println("3. Display list facility maintenance");
        System.out.println("4. Return main menu");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                facilityService.display();
                break;
            case 2:
                addNewFacilityMenu();
                break;
            case 3:
                facilityService.displayMaintain();
                break;
            case 4:
                displayMainMenu();
        }
    }

    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        System.out.println("1. Add new Villa");
        System.out.println("2. Add new House");
        System.out.println("3. Add new Room");
        System.out.println("4. Return main menu");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                facilityService.addNewVilla();
                displayFacilityMenu();
                break;
            case 2:
                facilityService.addNewHouse();
                displayFacilityMenu();
                break;
            case 3:
                facilityService.addNewRoom();
                displayFacilityMenu();
                break;
            case 4:
                displayFacilityMenu();
                break;
        }
    }

    public static void displayBookingMenu() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        ContractServiceImpl contractService = new ContractServiceImpl();
        System.out.println("1. Add new booking");
        System.out.println("1. Display list booking");
        System.out.println("3. Create new contracts");
        System.out.println("4. Display list contracts");
        System.out.println("5. Edit contracts");
        System.out.println("6. Return main menu");
        Scanner scanner = new Scanner(System.in);
        switch (scanner.nextInt()) {
            case 1:
                bookingService.addBooking();
                displayBookingMenu();
                break;
            case 2:
                bookingService.displayBooking();
                displayBookingMenu();
                break;
            case 3:
                contractService.createNewContract();
                displayBookingMenu();
                break;
            case 4:
                contractService.displayListContract();
                displayBookingMenu();
                break;
            case 5:

                break;
            case 6:
                displayMainMenu();
                break;
            default:
                System.out.println("No choice!");
                break;
        }
    }
}

