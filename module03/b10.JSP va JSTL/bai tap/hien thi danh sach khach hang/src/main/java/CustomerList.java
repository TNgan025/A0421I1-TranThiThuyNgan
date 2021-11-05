import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerList")
public class CustomerList extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
    public class Customer extends CustomerServlet{
private static List<Customer> customerList = new ArrayList<>();

    customerList.add(new Customer("Mai","1983-08-20","Ha Noi","anh1"));
    customerList.add(new Customer("Nguyen","1983-08-21","Giang"," 2"));
    customerList.add(new Customer("Khoa","1983-08-23","Ha Tay","anh4"));
    customerList.add(new Customer("Thi","1983-08-19","Ha Noi","anh 5"));

    }
}
