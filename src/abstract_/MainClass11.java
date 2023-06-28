package abstract_;

// 자바에서 제공해주는 기능(interface, class)
interface Test11{
	public void test();
}

class TestClass11{
	public void testClass(Test11 t) {
		System.out.println("기능 실행 합니다");
		t.test();
	}
}

public class MainClass11 {
	public static void main(String[] args) {
		
		TestClass11 t = new TestClass11();
		
		Test11 tt = new Test11() {
			public void test() {
				System.out.println("test");
			}
		};
		t.testClass(tt);
		
		System.out.println("=================");
		t.testClass(()-> {System.out.println("aaaaa");} );
	}
}
