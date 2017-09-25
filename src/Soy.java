
public class Soy extends CondimentDecorator{

	Beverage beverage;
	
	public Soy (Beverage beverage) {
		description = "Soy";
		this.beverage = beverage;
	}
	
	@Override
	public String getDescription() {
		return beverage.getDescription() + ", " + description;
	}

	@Override
	public double cost() {
		return 0.15 + beverage.cost();
	}
	

}
