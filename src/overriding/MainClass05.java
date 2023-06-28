package overriding;

class Test05{
	public void test1() {}
}

class TestClass05 extends Test05{

}

public class MainClass05 {
	public static void main(String[] args) {
		TestClass05 t = new TestClass05();
		System.out.println(t.getClass());
		System.out.println(t.toString());	// toString() : 해당하는 객체의 주소(정보)
		System.out.println("aaa".getClass());
	}
}
