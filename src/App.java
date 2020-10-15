import entities.Department;
import entities.Seller;
import model.daos.DaoFactory;
import model.daos.SellerDao;

import java.util.Date;

public class App {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Department dp = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "gmail@gmail.com", new Date(), 3200.00, dp);


        System.out.println(seller);



    }
}
