package abstract_;

interface Test10{
	public void test(int num, String msg);
}

public class MainClass10 {
	public static void main(String[] args) {
		
		Test10 t01 = new Test10() {
			public void test(int num, String msg) {
				System.out.println("num : " + num);
				System.out.println("msg : " + msg);
			}
		};
		t01.test(100, "test");
		
		// 위 : 기본  // 아래 : 람다
		Test10 t02 = (n, s) -> {
			System.out.println("num : " + n);
			System.out.println("msg : " + s);
		};
		
		t02.test(200, "test");
		
	}
}
