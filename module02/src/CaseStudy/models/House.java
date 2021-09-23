package CaseStudy.models;

public class House extends Facility{
    //-	Riêng loại House sẽ có thêm thông tin: Tiêu chuẩn phòng, Số tầng.
    private String standardHouse;
    private int floor;
    public House() {
    }

    public House(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHouse, int floor) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.standardHouse = standardHouse;
        this.floor = floor;
    }

    public House(String idFacility, String nameService, int rentalPrice, int rentalPeopleMax, String styleRental, String standardHouse, int floor) {
    }

    public String getStandardHouse() {
        return standardHouse;
    }

    public void setStandardHouse(String standardHouse) {
        this.standardHouse = standardHouse;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}
