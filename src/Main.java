import java.util.*;

/*******************************
 * Name: Your name Class: ICS3U Date: Friday Sept. 25 Project Name: Restaurant
 * 
 * You will have your first real project this week. You must meet all of the
 * following criteria: Create a restaurant of your choosing Print menu items one
 * at a time, including the price. Ask how many of each item they would like to
 * purchase Must have at least 5 different menu items Calculate the total price
 * If the total is more than $30, take off 10%. If the total is more than $50,
 * take off 20%. Add 13% HST to the total Print out the initial price, any
 * discounts, taxes, and the grand total. Read in a payment amount from the user
 * Calculate the change If the change is negative, state that they still owe you
 * money. This is to be done individually. DO NOT use AI! Feel free to use
 * previous notes, videos, and online resources like w3schools.com Fork the
 * repository, add me (MrZebarth) as a collaborator, clone the repository to
 * your computer, program your solution, and then commit and push the results.
 ********************************/
public class Main {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// Variables
		Map<String, Integer> nameToNumber = new HashMap<>();
		String Flavour = "";

		System.out.println("Welcome to Max's Meathouse!");
		System.out.println();
		System.out.println("Can I get you started with a drink? Y/N");
		System.out.println();
		String Acpt = in.nextLine();
		System.out.println();

		System.out.println("DRINKS:");
		System.out.println("Water ---- $0");
		System.out.println("Fuze Iced Tea ---- $3");
		System.out.println("Mug Root Bear ---- $3");
		System.out.println("Coke ---- $3");
		System.out.println("Coke Zero ---- $3");
		System.out.println("Sprite ---- $3");
		System.out.println("Fanta ---- $3");
		System.out.println("Ginger Ale ---- $3");
		System.out.println("Lemonade ---- $3 (HAS FLAVOURS)");
		System.out.println("Milkshake ---- $3 (HAS FLAVOURS)");
		System.out.println();
		String Drink = in.nextLine();

		if (Drink.equalsIgnoreCase("Milkshake")) {
			System.out.println();
			System.out.println("FLAVOURS:");
			System.out.println("Strawberry");
			System.out.println("Chocolate");
			System.out.println("Vanilla");
			System.out.println("Oreo");
			System.out.println("Banana");
			System.out.println();
			Flavour = in.nextLine();
			System.out.println();
			System.out
					.println(Flavour + " " + Drink + ", nice choice! Just call me when you're ready to see the menu.");

		} else if (Drink.equalsIgnoreCase("Lemonade")) {
			System.out.println();
			System.out.println("FLAVOURS:");
			System.out.println("Original");
			System.out.println("Strawberry");
			System.out.println("Watermelon");
			System.out.println("Blue raspberry");
			System.out.println("Raspberry");
			Flavour = in.nextLine();
			System.out.println();
			System.out.println(Flavour + " " + Drink + ", nice choice! Just call me when you're ready to see the menu");

		} else {
			System.out.println();
			System.out.println(Drink + ", nice choice! Just call me when you're ready to see the menu.");
			System.out.println();
		}

		String Call = in.nextLine();
		System.out.println();
		System.out.println("Here you go.");
		System.out.println();
		System.out.println("MENU:");
		System.out.println();
		System.out.println("BURGERS");
		System.out.println("Classic cheeseburger ---- $10");
		System.out.println("Bacon cheeseburger ---- $10");
		System.out.println("Plain burger ---- $10");
		System.out.println("Crispy chicken burger ---- $10");
		System.out.println("Spicy crispy chicken burger ---- $10");
		System.out.println("Smash burger ---- $10");
		System.out.println("Bacon smash burger ---- $10");
		System.out.println("Pepper x burger ---- $15 (CURRENTLY UNAVAILABLE DUE TO LEGAL ISSUES)");
		System.out.println();
		System.out.println("PLATES");
		System.out.println("*served with 1 large side and 2 rolls*");
		System.out.println("Pork plate ---- $30");
		System.out.println("Rib plate ---- $30");
		System.out.println("Brisket plate ---- $30");
		System.out.println("Steak plate ---- $30");
		System.out.println("Variety plate ---- $30");
		System.out.println();
		System.out.println("LARGE PLATES");
		System.out.println("*served wth 2 large sides and 3 rolls*");
		System.out.println("Large pork plate ---- $40");
		System.out.println("Large rib plate ---- $40");
		System.out.println("Large brisket plate ---- $40");
		System.out.println("Large steak plate ---- $40");
		System.out.println("Large variety plate ---- $4+0");
		System.out.println();
		System.out.println("SIDES");
		System.out.println("Mac and cheese ---- $5");
		System.out.println("Coleslaw ---- $5");
		System.out.println("Baked beans ---- $5");
		System.out.println("Fries ---- $5");
		System.out.println("Baked potatoes ---- $5");
		System.out.println("Mashed potatoes and gravy ---- $5");
		System.out.println("Onion rngs ---- $5");
		System.out.println("House salad ---- $5");
		System.out.println("Caesar salad ---- $5");
		System.out.println("Poutine ---- $5");
		System.out.println();
		System.out.println("LARGE SIDES");
		System.out.println("Large mac and cheese ---- $10");
		System.out.println("Large coleslaw ---- $10");
		System.out.println("Large baked beans");
		System.out.println("Large fries ---- $10");
		System.out.println("Large baked potatoes ---- $10");
		System.out.println("Large mashed potatoes and gravy ---- $10");
		System.out.println("Large onion rings ---- $10");
		System.out.println("Large house salad ---- $10");
		System.out.println("Large caesar salad ---- $10");
		System.out.println("Large poutine ---- $10");
		System.out.println();
		System.out.println("How many burgers would you like? *enter 0 for the following if you don't want any*");
		int numBurgers = in.nextInt();
		System.out.println();
		System.out.println("How many plates would you like?");
		int numPlates = in.nextInt();
		System.out.println();
		System.out.println("How many large plates would you like?");
		int numLPlates = in.nextInt();
		System.out.println();
		System.out.println("How many sides would you like?");
		int numSides = in.nextInt();
		System.out.println();
		System.out.println(
				"How many large sides would you like? *enter zero if you've ordered plates, unless you want more*");
		int numLSides = in.nextInt();
		System.out.println();
		System.out.println("So you'd like " + numBurgers + " burger(s), " + numPlates + " plate(s), " + numLPlates
				+ " large plate(s), " + numSides + " side(s), " + numLSides + " large side(s), with a " + Flavour + " "
				+ Drink);
		double total = numBurgers * 10 + numPlates * 30 + numLPlates * 40 + numSides * 5 + numLSides * 10 + 3;
		System.out.println("That'll be $" + total *1.13);
		
		
		if (total > 50) {
			System.out.println();
			System.out.println("Since your total is over $50, you'll be getting a 20% discount!");
			total = (total * 0.8);
			System.out.println();
			System.out.println("Your new total is $" + total*1.13);

		} else if (total > 30) {
			System.out.println();
			System.out.println("Since your total is over $30, you'll be getting a 20% discount!");
			total = (total * 0.9);
			System.out.println();
			System.out.println("Your new total is $" + total*1.13);

		}
	}

	
}
