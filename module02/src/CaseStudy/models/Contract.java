package CaseStudy.models;

public class Contract {
    //Hợp đồng thuê sẽ bao gồm các thông tin: Số hợp đồng, mã booking,
    // Số tiền cọc trước, Tổng số tiền thanh toán, mã khách hàng.
private String idContract, idBooking,idCustomer;
private int prePayment, payment;

    public Contract() {
    }

    public Contract(String idContract, String idBooking, String idCustomer, int prePayment, int payment) {
        this.idContract = idContract;
        this.idBooking = idBooking;
        this.idCustomer = idCustomer;
        this.prePayment = prePayment;
        this.payment = payment;
    }

    public String getIdContract() {
        return idContract;
    }

    public void setIdContract(String idContract) {
        this.idContract = idContract;
    }

    public String getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(String idBooking) {
        this.idBooking = idBooking;
    }

    public String getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(String idCustomer) {
        this.idCustomer = idCustomer;
    }

    public int getPrePayment() {
        return prePayment;
    }

    public void setPrePayment(int prePayment) {
        this.prePayment = prePayment;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }
}
