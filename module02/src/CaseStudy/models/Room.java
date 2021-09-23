package CaseStudy.models;

public class Room extends Facility {
    //-	Riêng loại Room sẽ có thêm thông tin: Dịch vụ miễn phí đi kèm.
    private String freeService;

    public Room() {
    }

    public Room(String idFacility, String nameService, double areaUse, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
        super(idFacility, nameService, areaUse, rentalPrice, rentalPeopleMax, styleRental);
        this.freeService = freeService;
    }

    public Room(String idFacility, String nameService, int rentalPrice, int rentalPeopleMax, String styleRental, String freeService) {
    }

    public String getFreeService() {
        return freeService;
    }

    public void setFreeService(String freeService) {
        this.freeService = freeService;
    }
}
