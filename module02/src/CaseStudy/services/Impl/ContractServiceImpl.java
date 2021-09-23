package CaseStudy.services.Impl;

import CaseStudy.models.Booking;
import CaseStudy.models.Contract;
import CaseStudy.models.Customer;
import CaseStudy.services.utils.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    @Override
    public void createNewContract() {
        Queue<Booking> bookingQueue = new LinkedList<>();
        Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();
        for (Booking booking : bookingSet) {
            bookingQueue.add(booking);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Make contract for booking: " + booking.toString());
            System.out.println("Make contract for customer: " + customer.toString());
            System.out.println("Input ID contract ");
            String idContract = scanner.nextLine();
            System.out.println("Input deposit amount ");
            String pre = scanner.nextLine();
            System.out.println("Input payment amount  ");
            String pay = scanner.nextLine();
            Contract contract = new Contract(idContract,booking, pre, pay, customer);
            contractList.add(contract);
            System.out.println("Contract was created sucessfully" + contract.toString());
        }
    }

    @Override
    public void displayListContract() {
        for (Contract contract : contractList) {
            System.out.println(contract.toString());
        }
    }

    @Override
    public void editContract() {

    }
}
