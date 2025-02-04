package bharath.assignments.java;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Collections {

	public static void main(String[] args) 
	{

		HashMap<String,String> EmployeeDetailsOne = new HashMap<String,String>();
		
		EmployeeDetailsOne.put("EmployeeID", "E001");
		EmployeeDetailsOne.put("Name", "AliceGreen");
		EmployeeDetailsOne.put("Age", "30");
		EmployeeDetailsOne.put("Gender", "Female");
		EmployeeDetailsOne.put("Department", "Engineering");
		EmployeeDetailsOne.put("Position", "Software Engineer");
		EmployeeDetailsOne.put("Salary", "75000");
		EmployeeDetailsOne.put("Email", "alice@example.com");
		EmployeeDetailsOne.put("ContactNumber", "9876543212");
		
		HashMap<String,String> EmployeeDetailsTwo = new HashMap<String,String>();
		
		EmployeeDetailsTwo.put("EmployeeID", "E002");
		EmployeeDetailsTwo.put("Name", "BobJhonson");
		EmployeeDetailsTwo.put("Age", "35");
		EmployeeDetailsTwo.put("Gender", "male");
		EmployeeDetailsTwo.put("Department", "Marketting");
		EmployeeDetailsTwo.put("Position", "Marketting Engineer");
		EmployeeDetailsTwo.put("Salary", "85000");
		EmployeeDetailsTwo.put("Email", "bob@example.com");
		EmployeeDetailsTwo.put("ContactNumber", "9876543214");
		
		HashMap<String,String> EmployeeDetailsThree = new HashMap<String,String>();
		
		EmployeeDetailsThree.put("EmployeeID", "E003");
		EmployeeDetailsThree.put("Name", "Carol White");
		EmployeeDetailsThree.put("Age", "28");
		EmployeeDetailsThree.put("Gender", "Female");
		EmployeeDetailsThree.put("Department", "Sales");
		EmployeeDetailsThree.put("Position", "Sales Executive");
		EmployeeDetailsThree.put("Salary", "65000");
		EmployeeDetailsThree.put("Email", "Carol@example.com");
		EmployeeDetailsThree.put("ContactNumber", "9876543215");
		
		List<Map<String,String>> Employees = new ArrayList<Map<String,String>>();
		//List<Map<String,String>> data = new ArrayList<Map<String,String>>();
		
		Employees.add(EmployeeDetailsOne);
		Employees.add(EmployeeDetailsTwo);
		Employees.add(EmployeeDetailsThree);
		
		//System.out.println(EmployeeDetailsTwo);
		System.out.println(Employees.get(1).get("Email")); 
	}

}
