package PizzaBillApp;
import java.util.List;
import java.util.ArrayList;

public class Pizza {
private String pizzaName;
private String pizzaSize;
private double pizzaPrice;
private double taxRate;

public Pizza(String pizzaName,String pizzaSize,double pizzaPrice) {
	this.pizzaName=pizzaName;
	this.pizzaSize=pizzaSize;
	this.pizzaPrice=pizzaPrice;
}
// Creating ArrayList to store the List of toppings add  
private List<Topping> toppings=new ArrayList<>();

public void addTopping(Topping topping) {
	toppings.add(topping);
}
public void setTaxRate(double taxRate) {
	this.taxRate=taxRate;
}
public double getTaxRate() {
	return this.taxRate;
}

// Calculate Sub total cost 
public double calculateSubTotalCost() {
	double toppingCost=toppings.stream().mapToDouble(Topping::getToppingPrice).sum();
	return toppingCost+pizzaPrice;
}
// Total Tax calculation
public double calculateTotalTaxes() {
	return getTaxRate()*calculateSubTotalCost();
}
// Calculate Grand total cost 
public double calculateGrandTotalCost() {
	return calculateSubTotalCost()+calculateTotalTaxes();
}
	
@Override
public String toString() {
	return  "\nPizza Name          : "+pizzaName+
			"\nPizza Size          : "+pizzaSize+
			"\nPizza Price         : $"+String.format("%.2f", pizzaPrice)+
			"\nToppings            : "+toppings;
	
}
}
