
public enum Dessert2 {
	APPLE(100), ICE_CREAM(200), CAKE(300),;
	
	private int price;
	
	private Dessert2(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}
