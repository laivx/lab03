public class SavingsAccountTest
{
	public static void main(String args[]){

		SavingsAccount saver1  = new SavingsAccount(2000.00);
		SavingsAccount saver2  = new SavingsAccount(3000.00);
		
		SavingsAccount.modifyInterestRate(4);
		System.out.println("At interest rate is: 4%");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("saver1 = %.2f\n", saver1.getsavingsBalance() );
		System.out.printf("saver2 = %.2f\n", saver2.getsavingsBalance() );
		SavingsAccount.modifyInterestRate(5);
		System.out.println("\nAfter incresing interest rate to 5% is: ");
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.printf("saver1 = %.2f\n", saver1.getsavingsBalance() );
		System.out.printf("saver2 = %.2f\n", saver2.getsavingsBalance() );
	}
}