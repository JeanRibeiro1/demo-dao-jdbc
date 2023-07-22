package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entity.Department;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DepartmentDao departmentDAO = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDAO.finById(4);
		System.out.println(department);
		
		System.out.println("\n=== TEST 3: department findAll ===");
		List<Department> list = departmentDAO.findAll();
		for (Department department2 : list) {
			System.out.println(department2);			
		}
	}

}
