package day0530;

public class CarMain2 {

	public static void main(String[] args) {
		
		FireEngine fe = new FireEngine();
//		Ambulance a = (Ambulance) fe;
//		부모(조상)으로부터 상속받은 클래스들은 서로 형변환이 불가능.
		
		Car c = (Car)fe;
		// 부모클래스는 자식클래스에 해당하기 때문에 형변환 가능
		
		
		if (fe instanceof FireEngine) {
		 	// instanceof
			// 참조변수가 참조하는 인스턴스의 실제 타입을 체크하는데 사용
			// 이항연산자, 연산결과는 true와 false로 구분
			// instanceof의 결과가 true이면 형변환이 가능
			System.out.println("FireEngine OK !");
		}
		
		if (fe instanceof Car) {
			System.out.println("Car OK !");
		}
		
		// 둘다 true이기 때문에 값 출력이 문제없이 실행됨.

	}

}
