package list03;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<String>();
		List<Integer> list2 = new LinkedList<Integer>();
		
		list1.add("りんご");
		list1.add("みかん");
		
		list1.add(1, "バナナ");
		
		System.out.println(list1);
		
//		エラー
//		list1.add(5,"ドリアン");
		
		System.out.println(list1.get(0));
		
		if(list1.contains("バナナ")) {
			System.out.println("リスト内に値が存在");
		}
		System.out.println(list1.contains("バナナ"));
		System.out.println(list1.contains("なし"));
		
		System.out.println(list1.size());
		
		list1.remove("バナナ");
		list1.remove("なし");
		list1.remove(0);
		
		System.out.println(list1);
		
		list2.add(12);
		list2.add(234);
		
		System.out.println(list2);
	}
	
}
