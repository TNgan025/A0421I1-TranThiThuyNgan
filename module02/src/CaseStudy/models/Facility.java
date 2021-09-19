package CaseStudy.models;

import java.sql.Time;

public abstract class Facility {
    //Các loại dịch vụ này sẽ bao có các thông tin: Tên dịch vụ, Diện tích sử dụng, Chi phí thuê, Số lượng người tối đa, Kiểu thuê (bao gồm thuê theo năm, tháng, ngày, giờ.
    private String ServiceName;
    private double RoomArea;
    private Integer Price;
    private Integer maxPerson;
    private Time time;

    public Facility() {
    }

    public String getServiceName() {
        return ServiceName;
    }

    public void setServiceName(String serviceName) {
        ServiceName = serviceName;
    }

    public double getRoomArea() {
        return RoomArea;
    }

    public void setRoomArea(double roomArea) {
        RoomArea = roomArea;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public Integer getMaxPerson() {
        return maxPerson;
    }

    public void setMaxPerson(Integer maxPerson) {
        this.maxPerson = maxPerson;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }
}
