
public class CoffeHouse {

	public static void main(String[] args) {
		
		System.out.println("I would like Dark Roast Soy and whip");
		
		Beverage darkRoast = new DarkRoast(); //desc = DarkRoast; cost: 0,99;
		darkRoast = new Soy (darkRoast);// desc = Dark roast + Soy; cost: = 1.14
		darkRoast = new Whip (darkRoast);// desc = Dark roast + Soy + Whi 
	
		System.out.println("Your " +darkRoast.getDescription() + " will cost " + darkRoast.cost());

	}

}
