package bharath.assignments.java;

public class Assignment6 
{

	public static void main(String[] args) 
	{
		String CustomerName = "John Doe"; 
		int CreditScore = 720;
		Double Income = 55000.0;
		Boolean IsEmployed =  true;
		float DebtTotalComeRatio = 35.0f;
		
		if(CreditScore > 750)
		{
			System.out.println("Your Loan is Appproved");
		}
		else if(CreditScore >= 650 && CreditScore <= 750)
		{
			//I HAVE TO CHECK THE CUSTOMER INCOME, WHETHER IT IS GREATER THAN 50000 OR NOT
			if(Income>= 50000.0)
			{
				System.out.println(CustomerName +" : Is Employed");
				
				//IF THE EMPLOYE INCOME IS GREATER THAN OR EQUAL = 50000 THE EMPLOYEE IS TRUE.
				IsEmployed = true;
				if(IsEmployed == true)
				{
					//AGAIN I HAVE TO CHECK THE DEBTTOTALCOMERATIO, WHETHER IT IS LESSER THAN 40% OR NOT
					if(DebtTotalComeRatio <= 40)
					{
						System.out.println(CustomerName +" : Your Loan is Appproved");
					}
					else
					{
						System.out.println(CustomerName +" : Your Loan is Denied Cause of your DebtTotalComeRatio is Greater Than 40%");
					}
				}
			}
			else
			{
				System.out.println(CustomerName +"Loan is Denied Cause of your Income is Lesser Than" + Income + "Or 50000");
			}
		}
	}

}

