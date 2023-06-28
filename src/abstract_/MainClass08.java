package abstract_;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

interface Test08{
	public int num = 100;
	public static final String name = "홍길동";
	public static String name1 = "홍길동";// final이 생략되어있어서 값을 변경할 수 없다
	public final String name2 = "홍길동";
}

class AAA{
	static int num = 100;
}

public class MainClass08 implements Test08{
	public static void main(String[] args) {

//		ArrayList<String> arr = new ArrayList<>();
//		HashMap<String, String> map = new HashMap<>();
//		HashSet<String> set = new HashSet<>();

		List<String> arr = new ArrayList<>();
		Map<String, String> map = new HashMap<>();
		Set<String> set = new HashSet<>();
		
		System.out.println(Test08.num);
		
		AAA.num = 200;
		// Test08.name1 = "aaaa";	// 값 변경 불가능 
		System.out.println(name1);
		System.out.println(name2);
		
		
	}
}
