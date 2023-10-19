# PizzaBillCalculator

Author: Navneet Singh

## Description

The Pizza Bill Calculator is a Java-based command-line application that enables users to create customized pizza orders, add toppings, and calculate the total cost. The application includes the following features:

- A user-friendly interface for choosing from predefined pizza options or creating custom pizzas.
- A system for adding toppings from a predefined list, ensuring a seamless customization process.
- Cost calculations, including taxes, subtotals, and grand totals, to generate accurate pizza order summaries.

## Usage Process

### 1. Choose Pizza Option
- Start by choosing a pizza option from the predefined list. Simply enter the pizza number. Alternatively, you can select the custom pizza option if you have a unique choice in mind.

### 2. Specify Pizza Size
- If you opt for a predefined pizza, you'll be prompted to choose the size (Regular, Medium, or Large), with the basic price adjusted accordingly. In the case of a custom pizza, you'll need to provide the pizza's name, size, and price.

### 3. Adding Toppings
- You have the option to add toppings to your pizza. Respond with 'Y' for yes or 'N' for no. If you choose 'Y', you can select from a list of predefined toppings, each with its associated price. If you wish to add more toppings, simply continue entering 'Y'. This process continues until you enter 'N'.

### 4. Calculating Subtotal
- The application calculates the subtotal cost using the `calculateSubTotalTaxes()` method, which combines the base pizza price and the toppings' cost.

### 5. Enter Taxes and Charges
- You'll be asked to input the applicable tax and additional charges in percentage form. The system will then use the `calculateTotalTaxes()` method to calculate the tax on your pizza order.

### 6. Calculating Grand Total
- The application computes the grand total cost using the `calculateGrandTotalCost()` method. This includes the subtotal cost and the total taxes, resulting in your total bill for the delicious pizza.

This process ensures a straightforward and enjoyable pizza ordering experience. Enjoy your pizza!
