package CaseStudy.services.Impl;

import CaseStudy.models.Booking;
import CaseStudy.models.Customer;
import CaseStudy.models.Facility;
import CaseStudy.models.Villa;
import CaseStudy.services.BookingService;
import CaseStudy.services.utils.BookingComparator;
import org.junit.platform.engine.support.hierarchical.HierarchicalTestEngine;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    Scanner scanner = new Scanner(System.in);

    static {
        customerList.add(new Customer(1, "Ha", 20, "Female",
                "008888", 3, "ha@gmail", "VIB", "Ha Noi"));
        customerList.add(new Customer(2, "Manh", 25, "Male",
                "009999", 7, "manh@gmail", "VIB", "Ha Tay"));
        facilityIntegerMap.put(new Villa("1", "Villa 01",
                500, 3, "Day", "VIP", 15, 2), 0);
        facilityIntegerMap.put(new Villa("2", "Villa 02",
                300, 2, "Day", "VIP", 5, 2), 0);
    }
public Set<Booking> sendBooking() {
        return bookingSet;
}
    @Override
    public void addBooking() {
        Scanner scanner = new Scanner(System.in);
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();

        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Input start date: ");
        String startDate = scanner.nextLine();
        System.out.println("Input end date: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, startDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("Add new booking sucessfully");
    }

    @Override
    public void displayBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display Customer Menu ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
        System.out.println("Input Id Customer");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }
            }
            if (check) {
                System.out.println(" Re-input Id");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;
    }

    public static Facility chooseFacility() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Display Facility Menu ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.getKey().toString());
        }
        System.out.println("Input Id Facility");
        boolean check = true;
        String id = scanner.nextLine();
        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    check = false;
                    return entry.getKey();
                }
            }
            if (check) {
                System.out.println(" Re-input Id");
                id = scanner.nextLine();
            }
        }
        return null;
    }

}
