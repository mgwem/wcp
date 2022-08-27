
public class If_practoce {
	public static void main(String[] args) {
		int number = 7;
		if (number < 5) {
			System.out.println(number + "は5未満です");
		}
		if (number < 10) {
			System.out.println(number + "は10未満です");
		}
		if (number < 15) {
			System.out.println(number + "は15未満です");
		}
		
		if (number < 5) {
			System.out.println(number + "は5未満です");
		} else if (number < 10) {
			System.out.println(number + "は5以上、10未満です");
		} else if (number < 15) {
			System.out.println(number + "は10以上、15未満です");
		} else {
			System.out.println(number + "は未満ではないです");
		}
		
//		switch
		int val = 2;
		switch (val) {
		case 3:
			System.out.println("よくできました");
			break;
		case 2:
			System.out.println("ふつうでした");
			break;
		default:
			System.out.println("がんばろう");
		}
		
//		確認問題
		int distance = 12;
		if (distance < 5) {
			System.out.println("とても近いです");
		} else if (distance < 10) {
			System.out.println("近いです");
		} else if (distance < 15) {
			System.out.println("遠いです");
		} else {
			System.out.println("とても遠いです");
		}
		
		String color = "red";
		switch (color) {
		case "red":
			System.out.println("赤信号です");
			break;
		case "yellow":
			System.out.println("黄信号です");
			break;
		case "blue":
			System.out.println("青信号です");
			break;
		default:
			System.out.println("信号の色ではありません");
		}
	}
}
