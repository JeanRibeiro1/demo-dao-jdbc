package application;

import java.util.Date;

import model.entity.Department;
import model.entity.Seller;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department obj = new Department(1,"books");
		Seller seller = new Seller(21,"Bob","bob@gmail.com", new Date(), 3000.0,obj);
		System.out.println(seller);
	}

}
