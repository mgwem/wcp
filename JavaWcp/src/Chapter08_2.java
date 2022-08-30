
public class Chapter08_2 {
	public static void main(String[] args) {
		int num = 1;
		while (num < 5) {
			System.out.println(num * num);
			num++;
		}
		
		int array[] = { 1, 2, 3, 4 };
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		
		for (int number : array) {
			if (number % 2 == 0) {
				continue;
			}
			System.out.println(number);
		}
	}
}
