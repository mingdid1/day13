package overriding;

// final : 상속할 수 없는 클래스로 만듬
final class Test03{
	public void test() {
		System.out.println("부모의 기능");
	}
}

class TestClass03{
	public void test() {
		Test03 t = new Test03();
		System.out.println("자식의 기능 실행");
	}
}

public class MainClass03 {
	public static void main(String[] args) {
		
	}
}
