package bharath.assignments.java;
import java.util.List;
import java.util.ArrayList;

public class Assignment7 {

	public static void main(String[] args) 
	{
		
	
		        int [] TransactionAmount = {50000 , -2000 , 3000 , -15000 , -200 , -300 , 4000 , -3000};
		        
		        List<Integer> Credited = new ArrayList<Integer>();
		        List<Integer> Debited = new ArrayList<Integer>();
		        List<Integer> SuspiciousTransaction = new ArrayList<Integer>();
		        
		        int CreditedAmount = 0;
		        int DebitedAmount = 0 ;
		        int SuspiciousTransactionAmount = 0;
		        
		         System.out.println("Total Transactions : " + TransactionAmount.length);
		        
		        for (int i : TransactionAmount)
		        {
		            if(i < 0)
		            {
		                Debited.add(i);
		                DebitedAmount += i;
		            }
		            else
		            {
		                Credited.add(i);
		                CreditedAmount += i;
		            }
		            if(i <= -10000 || i >= 10000)
		            {
		                SuspiciousTransaction.add(i);    
		            }
		        }
		         System.out.println("Total Amount Credited : " + CreditedAmount);
		         System.out.println("Total Amount Debited : " + DebitedAmount);
		         System.out.println("Total Amount Reamaing in the Bank : " + CreditedAmount);
		         
		         for (int J : SuspiciousTransaction)
		         {
		             SuspiciousTransactionAmount += J;
		         }
		 System.out.println("Total Suspicious Transaction had Done : " + SuspiciousTransaction.size());

	}

}
