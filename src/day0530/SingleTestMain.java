package day0530;

final class SingleTest {
	
	private static SingleTest s = new SingleTest();
	
	// private을 밖에서 값을 설정하지 못하도록 getter, setter가 필요함
	private int x;
	private int y;
	
	private SingleTest(){ // 값을 1개만 설정하기 위해 private 사용
		x = 10;
		y = 20;
	}
	
	public static SingleTest getSingleTest() {
		// 객체생성없이 사용하기 위해 static 사용
		return s;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
}

public class SingleTestMain {

	public static void main(String[] args) {
		
//		ingleTest st = new SingleTest(); -> private으로 생성자를 만들면 에러
		
		SingleTest t = SingleTest.getSingleTest(); // 메서드를 통해 접근		
		System.out.println("x = " + t.getX());
		System.out.println("y = " + t.getY());
		
		System.out.println();
		
		SingleTest t1 = SingleTest.getSingleTest();
		SingleTest t2 = SingleTest.getSingleTest();
		
		t1.setX(1000);
		System.out.println("x = " + t1.getX());
		System.out.println("y = " + t2.getX());
		// 하나의 인스턴스를 같이 사용하기 때문에 두 개의 값이 1000이 나옴
	}

}
