import java.util.Scanner;
//Programmer: Cristian Navarro
public class Inventory
{
	static Scanner sc = new Scanner(System.in);
	static double totCost, accCost;
	static int totUnits;
	static int option, cost, units, inStock;
	static String type, item;
	static String location;
	
public static void main(String args[])
{
	// variable declarations
	char loop = 'Y', changeItem = 'Y';
	while (loop == 'Y' || loop == 'y') {
	
	if (changeItem == 'Y' || changeItem =='y') {
		displayMenu();
		inputInfo1();	}
	else {
		inputInfo2();	}
	
	optionChoice();
	accumulationCalculator();
	checkInventory();
	int reorder = (int) (totUnits * 0.04);
	// program output
	System.out.println("output . . . ");
	System.out.println( "\nLocation: "+ location + "\nItem Type: " + item + "\nIn Stock: " + inStock + "\nUnit Cost: $" + cost + "\nTransaction Type: " + type +"\nUnits: " + units);
	System.out.println("\nTotal Cost: $" + accCost + "\nTotal Units: " + totUnits + "\nMinimum Reorder for next month: " + reorder);
	inStock = totUnits;
	// ask to run again
	System.out.println("Run again? (Y/N)");
	loop = sc.next().charAt(0);
	
	if (loop == 'Y' || loop =='y') {
		System.out.println("Change Item? ");
		changeItem = sc.next().charAt(0);
	}
	}
}

static void displayMenu()
{
	System.out.println("----------MENU----------");
	System.out.println("\n\toption 1: Shoes\n\n\toption 2: Book\n\n\toption 3: Soap\n\n\toption 4: Candy\n\n\toption 5: Game\n");
}

static void inputInfo1()
{
	// program input 
	System.out.println("please enter . . . ");
	
	System.out.print("Department Location: ");
	location = sc.next();
	System.out.print("Option: ");
	option = sc.nextInt();
	System.out.print("Current Stock of Item: ");
	inStock = sc.nextInt();
	System.out.print("Transaction Type: ");
	type = sc.next();
	System.out.print("Number of Units: ");
	units = sc.nextInt();
}

static void inputInfo2()
{
	System.out.println("please enter . . . ");
	
	System.out.print("Transaction Type: ");
	type = sc.next();
	System.out.print("Number of Units: ");
	units = sc.nextInt();
}

static void optionChoice()
{
	//choose option
	switch(option)
	{
	case 1: cost = 12; item = "Shoes"; break;
	case 2: cost = 23; item = "Book"; break;
	case 3: cost = 9; item = "Soap"; break;
	case 4: cost = 1; item = "Candy"; break;
	case 5: cost = 60; item = "Game"; break;
	}
}

static void accumulationCalculator()
{
	totCost = cost * units;
	accCost = inStock * cost;
	switch(type)
	{
	case "purchase":
		totUnits = inStock + units;
		accCost += totCost;
		break;
	case "sale":
		totUnits = inStock - units;
		accCost -= totCost;
		break;
	}
}

static void checkInventory()
{
	if (totUnits <= 0) {
		System.out.println("\nWARNING: Unit quantity has reached or surpassed zero!");
	}
		
}
}
