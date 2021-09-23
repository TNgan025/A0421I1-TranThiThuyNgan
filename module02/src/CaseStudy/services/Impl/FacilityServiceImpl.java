package CaseStudy.services.Impl;

import CaseStudy.models.Facility;
import CaseStudy.models.House;
import CaseStudy.models.Room;
import CaseStudy.models.Villa;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements FacilityService {
    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
//        for (Facility facility : facilityIntegerMap) {
//            System.out.println("facility = " + facility.toString());
//        }
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Service " + element.getKey() + "times rental " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {
//        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
//            System.out.println("Service " + element.getKey() + "times rental " + element.getValue());
//            Scanner scanner = new Scanner(System.in);
//        }
    }

    @Override
    public void addNewVilla() {
        System.out.println("Input idFacility: ");
        String idFacility = scanner.nextLine();
        System.out.println("Input nameService: ");
        String nameService = scanner.nextLine();
        System.out.println("Input rentalPrice: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Input rentalPeopleMax: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Input styleRental: ");
        String styleRental = scanner.nextLine();
        System.out.println("Input standardVilla: ");
        String standardVilla = scanner.nextLine();
        System.out.println("Input areaPool: ");
        double areaPool = Double.parseDouble(scanner.nextLine());
        System.out.println("Input floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility, nameService, rentalPrice, rentalPeopleMax, styleRental, standardVilla, areaPool, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Add new Villa sucessfully");
    }

    //String idFacility, String nameService, double areaUse,
// int rentalPrice, int rentalPeopleMax, String styleRental, String standardHouse, int floor
    @Override
    public void addNewHouse() {
        System.out.println("Input idFacility: ");
        String idFacility = scanner.nextLine();
        System.out.println("Input nameService: ");
        String nameService = scanner.nextLine();
        System.out.println("Input rentalPrice: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Input rentalPeopleMax: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Input styleRental: ");
        String styleRental = scanner.nextLine();
        System.out.println("Input standardHouse: ");
        String standardHouse = scanner.nextLine();
        System.out.println("Input floor: ");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(idFacility, nameService, rentalPrice, rentalPeopleMax, styleRental, standardHouse, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Add new House sucessfully");

    }

    @Override
    public void addNewRoom() {
        System.out.println("Input idFacility: ");
        String idFacility = scanner.nextLine();
        System.out.println("Input nameService: ");
        String nameService = scanner.nextLine();
        System.out.println("Input rentalPrice: ");
        int rentalPrice = Integer.parseInt(scanner.nextLine());
        System.out.println("Input rentalPeopleMax: ");
        int rentalPeopleMax = Integer.parseInt(scanner.nextLine());
        System.out.println("Input styleRental: ");
        String styleRental = scanner.nextLine();
        System.out.println("Input freeService: ");
        String freeService = scanner.nextLine();
        Room room = new Room(idFacility, nameService, rentalPrice, rentalPeopleMax, styleRental, freeService);
        facilityIntegerMap.put(room, 0);
        System.out.println("Add new Room sucessfully");

    }
}
