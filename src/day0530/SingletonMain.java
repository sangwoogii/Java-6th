package day0530;

final class Singleton { // 상속을 받을 수 없기 때문에 보통 final을 사용함
	
	private static Singleton single = new Singleton();
	// 클래스에 바로 객체생성
	
	private Singleton() {}
	// 같은 클래스 내에서만 사용 가능하도록 제한하는 기본 생성자
	// 생성자 자체가 private이기 때문에 상속받을 수 없음
	
	static Singleton getInstance() { // Singleton 타입의 getInstance라는 메서드
		return single;
	}
}

public class SingletonMain {

	public static void main(String[] args) {
		
//		Singleton obj1 = new Singleton();	 일반적인 객체생성,
// 		생성자를 private으로 하면 객체 생성에 에러가 뜸 
		
		Singleton obj1 = Singleton.getInstance(); // Singleton의 객체생성
		Singleton obj2 = Singleton.getInstance(); // Singleton의 객체생성
		
		if (obj1 == obj2) {
			System.out.println("같은 Singleton 객체");
		} else {
			System.out.println("다른 Singleton 객체");
		}
	}

}
