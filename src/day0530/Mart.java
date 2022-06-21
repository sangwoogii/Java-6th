package day0530;

class Product extends Object {
	int price;			// 물건의 가격
	int bonusPoint;		// 적립금
	
	Product (int price) { // 매개변수 1개를 갖는 생성자
		this.price = price;
		bonusPoint = (int)(price / 10.0); // 보너스포인트 : 10%
	}
}

class Tv extends Product {
	Tv(){
		super(100);
	}
	
	public String toString() { // toString = 문자열반환
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super (200);
	}
	
	public String toString() {
		return "Computer";
	}
}

// 손님
class Buyer {
	int money = 1000;	
	int bonusPoint = 0;
	
	void buy(Product p) { // Tv는 product를 상속받았기 때문에 가능
		if (money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		money -= p.price; // money = money - p.price;
		bonusPoint += p.bonusPoint; // bonusPoint = bonusPoint + p.bonusPoint;
		
		System.out.println(p + "를 구매하였습니다.");
	}
}

public class Mart {

	public static void main(String[] args) {
		
		Buyer b = new Buyer();	// 손님 1명
		
		Product p = new Tv();	// Tv객체를 product타입으로 다루게 된다는 의미
		b.buy(p);
		// b.buy(new Tv()); 이렇게 쓰는 것과 동일함
		
		System.out.println("현재 잔액은 " + b.money + "원");
		System.out.println("보너스 포인트는 " + b.bonusPoint + "점");
		
		System.out.println();
		
		Product p1 = new Computer();
		b.buy(p1);
		// b.buy(new Computer()); 
		
		System.out.println("현재 잔액은 " + b.money + "원");
		System.out.println("보너스 포인트는 " + b.bonusPoint + "점");
	}

}
