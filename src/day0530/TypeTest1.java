package day0530;

class A {
	A () { // 생성자
		System.out.println("A 메서드");
	}
}

class B extends A {
	B () { // 생성자
//		super ();  -> 상속 받으면 부모의 생성자도 자동적으로 상속받은 클래스에 따라오게 됨
		System.out.println("B 메서드");
	}
}


public class TypeTest1 {

	public static void main(String[] args) {
		
//		A a = new A(); 
//		B b = new B();	// 일반적인 객체 생성 방법
		
		A ab = new B();
//		B ab = new A();  -> 에러
		
		// A : 부모 / B : 자식

		// 부모 -> 자식 에러가 뜨지 않음
		// 자식 -> 부모 에러 : 자식의 필드 수가 부모보다 같거나 많기 때문에
	}

}
