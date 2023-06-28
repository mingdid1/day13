package abstract_;

abstract class TestClass01 {
	public abstract void function();	// 코드가 없는 메소드 생성 후 (추상화) 
	
	public void test() {
		System.out.println("test 기능");
	}
}

class Test01 extends TestClass01{
	public void test01() {
		System.out.println("새로운 기능");
	}
	public void function() {	// 상속받은 메소드에서 실체화 해줘야함
		System.out.println("실체화");
	}
}

public class MainClass01 {
	public static void main(String[] args) {
		
	}
}
