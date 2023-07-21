package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entity.Department;
import model.entity.Seller;

public class Main {

	public static void main(String[] args) {

		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		
		System.out.println("=== TEST 1: seller findById ===");
		Seller seller = sellerDao.finById(3);
		
		
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDeparment ===");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller seller2 : list) {
			System.out.println(seller2);
			
		}
	}

}
