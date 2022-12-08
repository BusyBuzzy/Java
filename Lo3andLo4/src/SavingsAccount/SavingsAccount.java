package SavingsAccount;

public class SavingsAccount {
static private double annualInterestRate;
private double savingBalance;
public SavingsAccount(double savingBalance) {
	this.savingBalance=savingBalance;
}
	
	public double getSavingBalance() {
		return this.savingBalance;
	}
	public static void Modifyinterestrate(double newinterest) {
		annualInterestRate=newinterest;
	}
	public void calculateMonthlyInterest() {
		double monthly;
		monthly=(double)(this.savingBalance*annualInterestRate/12);
		this.savingBalance+=monthly;
	}
}
