package day0530;

class Animal extends Object { // 동물들의 공통적인 속성을 저장 (부모)
	
	String name;
	
	public void cry () { // 메서드
		System.out.println(name + "(이)가 소리를 낸다.");
	}
}

class Dog extends Animal {
	
	// 오버라이드의 표시법 (오른쪽 마우스 source -> Overide ~)
	// 어노테이션
	@Override 
	public void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("멍멍 !");
	}

	public void run () {
		System.out.println(name + "가 뛴다.");
	}
}

class Cat extends Animal {
	
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		super.cry();
		System.out.println("야옹 ~");
	}

	public void grooming () {
		System.out.println(name + "가 그루밍을 한다.");
	}
}

class AnimalAction {
	
	public void action(Animal animal) { // 업캐스팅
		animal.cry();
		
		if (animal instanceof Dog) { // animal이 Dog타입인지 확인
			((Dog) animal).run();			// Dog타입을 형변환된 것, 다운캐스팅 
		} else if (animal instanceof Cat) {
			((Cat) animal).grooming();		// Cat타입을 형변환된 것, 다운캐스팅
		}
	}
}

public class AnimalMain {

	public static void main(String[] args) {
		
		AnimalAction a = new AnimalAction();

		Dog d = new Dog();
		d.name = "강아지";
		
		Cat c = new Cat();
		c.name = "고양이";
		
		a.action(d);
		System.out.println();
		a.action(c);
	}

}
