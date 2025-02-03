package bharath.assignments.java;

public class EmployeeGroups
{

	public static void main(String[] args) 
	{		
		Employee EmployeeObject = new Employee();
		
		int ENTotalValue = EmployeeObject.Employee.length ; 
		int EITotalValue = EmployeeObject.EmpID.length;
		
		String [] EmployeeNames = new String[ENTotalValue];
		int [] EmployeeIDs = new int [EITotalValue];
		
		for(int i = 0 ; i < EmployeeObject.Employee.length ; i++)
		{
			EmployeeNames[i] = EmployeeObject.Employee[i];
			EmployeeIDs[i] = EmployeeObject.EmpID[i];
		}
		
		for (int J = 0 ; J < EmployeeNames.length; J++)
		{
			System.out.println("EmployeeName :"+ EmployeeNames[J] +" & "+ "EmployeeID :" + EmployeeIDs[J]);
		}
	}

}
