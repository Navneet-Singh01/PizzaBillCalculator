package PizzaBillApp;

public class Topping {
private String toppingName;
private double toppingPrice;

public Topping(String toppingName,double toppingPrice) {
	this.toppingName=toppingName;
	this.toppingPrice=toppingPrice;
	
}

public double getToppingPrice() {
	return this.toppingPrice;
}
@Override
public String toString() {
	return toppingName+" : $"+toppingPrice;
}
}
