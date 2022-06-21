package day0530;

class Car {
	
	String color = "white";
	int door = 4;
	
	Car(){} // 기본 생성자
	
	void drive() { // 메서드
		System.out.println("달려 ~");
	}
	
	void stop() { // 메서드
		System.out.println("멈춰 !");
	}
}

class FireEngine extends Car {
	// Car 클래스를 상속받는 FireEngine 클래스
	// Car : 부모 / FireEngine : 자식
	void water() {
		System.out.println("불꺼요 !");
	}
}

class Ambulance extends Car {
	// Car 클래스를 상속받는 Ambulance 클래스
	// Car : 부모 / Ambulance : 자식
	void siren() {
		System.out.println("삐뽀삐뽀 ~");
	}
}


public class CarMain {

	public static void main(String[] args) {
		
		FireEngine f = new FireEngine(); // 총 5개의 멤버 사용가능
		System.out.println(f.color);
		System.out.println(f.door);
		f.drive();
		f.stop();
		f.water();
		
		System.out.println("------------------");
		
		Car c = f;
		System.out.println(c.color);
		System.out.println(c.door);
		c.drive();
		c.stop();
//		c.water();  ->  에러
		
		System.out.println("------------------");
		
		FireEngine f2 = (FireEngine)c;	// 참조변수의 형변환
		System.out.println(f2.color);
		System.out.println(f2.door);
		f2.drive();
		f2.stop();
		f2.water();
		
		System.out.println("------------------");
		
//		Ambulance a = (Ambulance) f2;
//		상속 관계가 아닌 클래스에는 참조변수의 형변환이 불가능하다.
		
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = (Car)fe;	// (Car) 생략가능 -> upcasting
		
//		car.water(); -> 에러
		
		fe2 = (FireEngine)car;
		// (조상)4개 -> (자식)5개 사용하는건 가능 -> 업캐스팅이라고도 함
		// (조상)5개 -> (자식)4개 사용하는건 불가능 -> 형변환이 필요함
		
		// 참조변수의 타입과 인스턴스타입이 일치해야함
		// 일치하지 않다면 참조변수에 맞는 형변환을 해주어야함
		 
	}

}
