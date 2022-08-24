
public class Enum05 {
	public static void main(String[] args) {
		System.out.println(Dessert.APPLE.name());
		
		Dessert apple = Dessert.valueOf("APPLE");
		System.out.println(apple);
		
//		例外
//		Dessert orange = Dessert.valueOf("ORANGE");
//		System.out.println(orange);
		
		System.out.println(Dessert.APPLE.ordinal());
		System.out.println(Dessert.ICE_CREAM.ordinal());
		System.out.println(Dessert.CAKE.ordinal());
		
		System.out.println(Dessert2.APPLE.getPrice());
		System.out.println(Dessert2.ICE_CREAM.getPrice());
		System.out.println(Dessert2.CAKE.getPrice());
		
		Dessert3.APPLE.advertise();
		Dessert3.ICE_CREAM.advertise();
		Dessert3.CAKE.advertise();
	}
}
