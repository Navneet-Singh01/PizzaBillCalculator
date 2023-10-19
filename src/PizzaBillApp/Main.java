package PizzaBillApp;
import java.util.Scanner;
public class Main {
public static void main(String[] args) {
	
	System.out.println("Welcome to Pizza Corner.\nPlease place your order from the Pizza Menu:");
	System.out.println("\nVEG PIZZA:");
	System.out.println("1. Blazing Onion & Paprika | Regular-$2.15 | Medium-$4.30 | Large-$6.45");
	System.out.println("2. Margherita              | Regular-$1.32 | Medium-$2.64 | Large-$3.96");
	System.out.println("3. Peppy Paneer            | Regular-$3.12 | Medium-$6.24 | Large-$9.36");
	System.out.println("4. Cheese & Corn           | Regular-$2.52 | Medium-$5.04 | Large-$7.56");
	System.out.println("\nNON-VEG PIZZA:");
	System.out.println("5. Pepper Barbecue Chicken | Regular-$3.00 | Medium-$6.00 | Large-$9.00");
	System.out.println("6. Chicken Sausage         | Regular-$2.52 | Medium-$5.04 | Large-$7.56");
	System.out.println("7. Chicken Pepperoni       | Regular-$4.31 | Medium-$8.62 | Large-$12.93");
	System.out.println("8. Custom Pizza\n");
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter your Pizza choice number: ");
	int choice = input.nextInt();
	
	Pizza pizza=null;
	
	// Choose required pizza number 
	if(choice>=1 && choice<=7) {
		String[] pizzaName= {"Blazing Onion & Paprika","Margherita","Peppy Paneer","Cheese & Corn","Pepper Barbecue Chicken","Chicken Sausage","Chicken Pepperoni"};
		String[] pizzaSize= {"Regular","Medium","Large"};
		double[] pizzaPrice= {2.15,1.32,3.12,2.52,3.00,2.52,4.31};
		// Enter size of pizza required
		System.out.print("Enter pizza size: ");
		String size=input.next();
		
		if(size.equalsIgnoreCase("Regular")) {
			pizza = new Pizza(pizzaName[choice-1],pizzaSize[0],pizzaPrice[choice-1]);
		}else if(size.equalsIgnoreCase("Medium")) {
			pizza = new Pizza(pizzaName[choice-1],pizzaSize[1],pizzaPrice[choice-1]*2);
		}else if(size.equalsIgnoreCase("Large")) {
			pizza = new Pizza(pizzaName[choice-1],pizzaSize[2],pizzaPrice[choice-1]*3);
	}else {
		System.out.println("Invalid Pizza Size!");
		return;
	}	
}else if(choice==8) {
	System.out.print("Enter Custom Pizza name: ");
	String pizzaName= input.next();
	System.out.print("Enter Custom Pizza size: ");
	String pizzaSize= input.next();
	System.out.print("Enter Custom Pizza price: ");
	double pizzaPrice=input.nextDouble();
	
	pizza = new Pizza(pizzaName,pizzaSize,pizzaPrice);
} else {
	System.out.println("Invalid choice.");
	return;
}
	//Add Toppings
	System.out.print("Add Toppings(Y/N): ");
	String ans=input.next();
	
	if(ans.equalsIgnoreCase("Y")) {
		System.out.println("\nAvailabe Topping: ");
		System.out.println("1. Chilli | Price-$1.00");
		System.out.println("2. Cheese | Price-$1.50");
	}
	String[] toppingNameChoose= {"Chilli","Cheese","None"};
	double[] toppingPriceChoose= {1.00,1.50,0};
	while(true) {
		if(ans.equalsIgnoreCase("N")) { 
			Topping topping = new Topping(toppingNameChoose[2],toppingPriceChoose[2]);
			pizza.addTopping(topping);
			break;}
		// Choose required Toppings
		System.out.print("\nEnter Topping choice number: ");
		int toppingChoice=input.nextInt();
		
		Topping topping = new Topping(toppingNameChoose[toppingChoice-1],toppingPriceChoose[toppingChoice-1]);
		pizza.addTopping(topping);
		
		System.out.print("Topping added! want to add more(Y/N): ");
		String addMoreToppings=input.next();
		
		if(addMoreToppings.equalsIgnoreCase("N")) {break;}
	}
	
	// Adding Tax and Charges
	System.out.print("\nEnter Tax and Charges (in %): ");
	double taxRate= input.nextDouble();
	pizza.setTaxRate(taxRate/100);
	double taxTotal=pizza.calculateTotalTaxes();
	
	// Calculate Sub total cost
	double subTotal=pizza.calculateSubTotalCost();
	
	// Calculate Grand total cost
	double grandTotal=pizza.calculateGrandTotalCost();
	
	input.close();
	// Displaying bill details
	System.out.println("\nPizza Bill Details:");
	System.out.println(pizza);
	System.out.printf("Sub Total           : $%.2f%n",subTotal);
	System.out.printf("Tax and Charges     : $%.2f%n",taxTotal);
	System.out.printf("Grand Total         : $%.2f%n",grandTotal);
}	
}