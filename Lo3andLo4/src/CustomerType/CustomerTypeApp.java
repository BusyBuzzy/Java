package CustomerType;

import java.text.NumberFormat;

public class CustomerTypeApp {
public static double getDiscountPercent(CustomerType cut) {
	double DiscountPercent=0.00;
	if(cut ==CustomerType.Retail)
		DiscountPercent=.10;
	else if(cut ==CustomerType.College)
		DiscountPercent=.20;
	else if(cut ==CustomerType.Trade)
		DiscountPercent=.30;
	
	
	return DiscountPercent;

}
public static void main(String[] args) {
	System.out.println("Customer Type App\n");
	
	System.out.println("For College");
	double Customer=getDiscountPercent(CustomerType.College);
	NumberFormat Percent=NumberFormat.getPercentInstance();
	String display="Discount Percent:      "+Percent.format(Customer);
	System.out.println(display);
	//////////////////////////
	System.out.println("For Retail");
	double Customer1=getDiscountPercent(CustomerType.Retail);
	NumberFormat Percent1=NumberFormat.getPercentInstance();
	String display1="Discount Percent:      "+Percent1.format(Customer1);
	System.out.println(display1);
	////////////////////////////
	System.out.println("For Trade");
	double Customer2=getDiscountPercent(CustomerType.Trade);
	NumberFormat Percent2=NumberFormat.getPercentInstance();
	String display2="Discount Percent:      "+Percent2.format(Customer2);
	System.out.println(display2);
}
}
