package application;

import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entity.Department;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		DepartmentDao departmentDAO = DaoFactory.createDepartmentDao();

		System.out.println("=== TEST 1: department findById ===");
		Department department = departmentDAO.finById(4);
		System.out.println(department);
		
		System.out.println("\n=== TEST 2: department findAll ===");
		List<Department> list = departmentDAO.findAll();
		for (Department department2 : list) {
			System.out.println(department2);			
		}
		System.out.println("\n=== TEST 3: department insert ===");
		Department newDepartment = new Department(null, "Music");
		departmentDAO.insert(newDepartment);
		System.out.println("Inserted! New id: " + newDepartment.getId());
		
		System.out.println("\n=== TEST 5: department update ===");
		department = departmentDAO.finById(6);
		department.setName("food");
		departmentDAO.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 5: seller delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDAO.deleteById(id);
		System.out.println("Delete completed");
		sc.close();
	}

}
