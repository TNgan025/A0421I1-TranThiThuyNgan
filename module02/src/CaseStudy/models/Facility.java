package CaseStudy.models;

import java.sql.Time;

public abstract class Facility {
    //Các loại dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    private String idFacility;
    private String nameService;
    private double areaUse;
    private Integer rentalPrice;
    private Integer rentalPeopleMax;
    private String styleRental;

    public Facility() {
    }

    public Facility(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental) {
    }

    public String getIdFacility() {
        return idFacility;
    }

    public void setIdFacility(String idFacility) {
        this.idFacility = idFacility;
    }

    public String getNameService() {
        return nameService;
    }

    public void setNameService(String nameService) {
        this.nameService = nameService;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public Integer getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Integer rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    public Integer getRentalPeopleMax() {
        return rentalPeopleMax;
    }

    public void setRentalPeopleMax(Integer rentalPeopleMax) {
        this.rentalPeopleMax = rentalPeopleMax;
    }

    public String getStyleRental() {
        return styleRental;
    }

    public void setStyleRental(String styleRental) {
        this.styleRental = styleRental;
    }
}
