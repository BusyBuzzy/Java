package SavingsAccount;

public class TestSavingBalance {
public static void main(String[] args) {
	//int total=0;
	SavingsAccount saver1,saver2;
	saver1=new SavingsAccount(2000.00);
	saver2 =new SavingsAccount(3000.00);
	
	SavingsAccount.Modifyinterestrate(0.03);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	System.out.println("This Month\nSaver1 Balance= "+saver1.getSavingBalance());
	System.out.println("Saver2 Balance= "+ saver2.getSavingBalance());
	
	SavingsAccount.Modifyinterestrate(0.04);
	saver1.calculateMonthlyInterest();
	saver2.calculateMonthlyInterest();
	System.out.println("Next Month\nSaver1 Balance= "+saver1.getSavingBalance());
	System.out.println("Saver2 Balance= "+saver2.getSavingBalance());
}
}
