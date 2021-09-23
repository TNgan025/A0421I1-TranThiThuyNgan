package CaseStudy.models;

public class Villa extends Facility {
    private String StandardVilla;
    private double areaPool;
    private int floor;

    public Villa() {
    }

    public Villa(String idFacility,
                 String nameService,
                 double areaUse,
                 int rentalPrice,
                 int rentalPeopleMax,
                 String styleRental,
                 String standardVilla,
                 double areaPool,
                 int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.StandardVilla = standardVilla;
        this.areaPool = areaPool;
        this.floor = floor;
    }

    public Villa(String idFacility, String nameService, int rentalPrice, int rentalPeopleMax, String styleRental, String standardVilla, double areaPool, int floor) {
    }

    public String getStandardVilla() {
        return StandardVilla;
    }

    public void setStandardVilla(String standardVilla) {
        StandardVilla = standardVilla;
    }

    public double getAreaPool() {
        return areaPool;
    }

    public void setAreaPool(double areaPool) {
        this.areaPool = areaPool;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
