
public class For01_2 {
	public static void main(String[] args) {
		for (int number =1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
		
		int[] array = { 1, 2, 3, 4, 5 };
		for (int number : array) {
			System.out.println("For02 = " + number);
		}
		
//		break
		for (int count = 0; count < 5; count++) {
			if (count == 2) {
				break;
			}
			System.out.println("Break01 = " + count);
		}
		
//		continue
		for (int count2 = 0; count2 < 5; count2++) {
			if (count2 == 2) {
				continue;
			}
			System.out.println("Countnue01 = " + count2);
		}
		
//		再帰処理
		int number2 = 1;
		printNum(number2);
	}
	
	public static int printNum(int number2) {
		if(number2 < 50) {
			number2 *= 2;
			System.out.println("While01 = " + number2);
			printNum(number2);
		}
		return number2;
	}
 }
