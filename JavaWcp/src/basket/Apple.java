package basket;

import java.math.BigDecimal;

public class Apple extends Fruit {
	Apple(String name, BigDecimal price) {
		super(name, price);
	}
	
	@Override
	protected String getName() {
		return name;
	}
	
	@Override
	protected BigDecimal getPrice() {
		return price;
	}
	
	public static void main(String[] args) {
		Basket<Apple> appleBasket = new Basket<>(new Apple("ふじ", new BigDecimal(200)));
		appleBasket.printTotalPrice();
	}
	
}
