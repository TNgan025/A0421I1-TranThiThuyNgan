package model;

public class Product {
//    Các thuộc tính của sản phẩm bao gồm: id, tên sản phẩm, giá sản phẩm, mô tả của sản phẩm, nhà sản xuất
private int ID;
private String name;
private int price;
private String description;
private String producer;

    public Product() {
    }

    public Product(int ID, String name, int price, String description, String producer) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.description = description;
        this.producer = producer;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
}
