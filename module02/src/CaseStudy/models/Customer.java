package CaseStudy.models;

public class Customer extends Person{
    private String typeCustomer;
    private String address;

    public Customer() {
    }

    public Customer(String customerType, String address) {
        this.typeCustomer = customerType;
        this.address = address;
    }

    public Customer(int id, String name, int age, String sex, String idCard, int phone, String email, String customerType, String address) {
        super(id, name, age, sex, idCard, phone, email);
        this.typeCustomer = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return typeCustomer;
    }

    public void setCustomerType(String customerType) {
        this.typeCustomer = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +super.toString() +
                "typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

