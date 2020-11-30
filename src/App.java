import entities.Department;
import entities.Seller;
import model.daos.DaoFactory;
import model.daos.SellerDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class App {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Department dp = new Department(2, "Books");
//        Seller seller = new Seller(21, "Bob", "gmail@gmail.com", new Date(), 3200.00, dp);
//        Seller seller = sellerDao.findById(3);
//        List<Seller> list = sellerDao.findByDepartment(dp);
        List<Seller> list = sellerDao.findAll();


//        System.out.println(seller);

        System.out.println(" === teste find all department \n");
        for (Seller obj: list) {
            System.out.println(obj);
        }



    }
}
