package abstract_;
/*
 	interface
 	- 추상화 메소드만 포함할 수 있다
 	- 변수는 static final 형식으로만 만들어진다
 	- 다중 상속이 가능하다
*/
//class A{}				// A 기능
//class B extends A{} 	// A, B 기능
//class C extends B{}	// A, B, C 기능

interface A02{}

interface B02{
	public void test();
}

class C02{
	public void test1() { }
}

class Test02 extends C02 implements A02, B02{
	public void test() {
		
	}
	
}

public class MainClass02 {
	public static void main(String[] args) {
		
	}
}
