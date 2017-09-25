
public class Mocha extends CondimentDecorator{

	Beverage beverage;
	
	public Mocha (Beverage beverage) {
		description = "Mocha";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + description;
	}

	@Override
	public double cost() {
		return 0.20 + beverage.cost();
	}
	

}
