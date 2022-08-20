
public class Enum04 {
	public static void main(String[] args) {
		String x = new String("あ");
		String y = new String("あ");
		
		System.out.println("参照型");
		System.out.println(x == y);
		System.out.println(x.equals(y));
		
		Dessert a = Dessert.APPLE;
		Dessert b = Dessert.APPLE;
		
		System.out.println("列挙型");
		System.out.println(a == b);
		System.out.println(a.equals(b));
	}
}
