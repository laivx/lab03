public class SavingsAccount
{
	static double  annualInterestRate = 0 ;

	private double savingsBalance ;

	public SavingsAccount(){
		this.savingsBalance = 0;
	}
	public SavingsAccount(double savingsBalance){
		this.savingsBalance = savingsBalance;
	}
	public double getsavingsBalance(){
		return savingsBalance;
	}
	public double calculateMonthlyInterest() {
		double a = (savingsBalance * annualInterestRate/100)/12;
		this.savingsBalance += a;
		return a;
	}
	static void modifyInterestRate(double a){
		annualInterestRate = a;
	}
}
