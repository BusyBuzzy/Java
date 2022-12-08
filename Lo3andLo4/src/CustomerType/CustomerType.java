package CustomerType;

public enum CustomerType {
Retail(.10,"Retail Customer"),
College(.20,"College Customer"),
Trade(.30,"Trade Customer");
private final double DiscountPercent;
private final String description;
private CustomerType(double DiscountPercent,String description) {
	this.DiscountPercent=DiscountPercent;
	this.description=description;
	
	
}
public double getDiscountPercount() {
	return DiscountPercent;
}
public String getDescription() {
	return description;
}
public String toString() {
	return description;
}
	}

