import entities.Department;
import entities.Seller;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        Department dp = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "gmail@gmail.com", new Date(), 3200.00, dp);


        System.out.println(seller);



    }
}
