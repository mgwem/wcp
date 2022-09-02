package list03;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.List;

public class List02 {
	public static void main(String[] args) {
		List<String> prefectures = new ArrayList<String>();
		prefectures.add("北海道");
		prefectures.add("青森県");
		prefectures.add("秋田県");
		
		for (String prefecture : prefectures) {
			System.out.println(prefecture);
		}
	}
}
