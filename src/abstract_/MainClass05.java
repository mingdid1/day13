package abstract_;

class A지상군05 implements Army{
	
	public void 총알장전() {
		System.out.println("총알장전");
	}
	public void 방패설치() {
		System.out.println("방패설치");
	}
	public void attack() {
		System.out.println("지상군 공격");
	}
	public void defense() {
		System.out.println("지상군 방어");
	}
}

public class MainClass05 {
	public static void main(String[] args) {
		Army a = new Army() {
			
			@Override
			public void defense() {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void attack() {
				// TODO Auto-generated method stub
				
			}
		};
	}
}
