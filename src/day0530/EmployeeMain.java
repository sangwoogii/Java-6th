package day0530;

class Employee {
	// Employee에서 직원의 수를 카운트하고싶다
	
	private String name;	// 이름
	private double salary;	// 급여 , private을 쓰지않으면 default가 됨
	
	private static int count = 0;	
	// static 변수 (=정적변수, =클래스변수)
	// count를 static으로 주는 이유 ?
	
	Employee (String name, double salary) { // 매개변수 2개를 받는 생성자
		this.name = name;
		this.salary = salary;
		count++; // 메인에서 객체가 생성될때 마다 카운트가 1씩 증가한다는 의미
	}
	
	
	// 객체가 소멸될 때 호출되는 메서드 (기존에 만들어져 있던 것)
	protected void finallize() {
		count--;
	}
	
	
	public static int getCount() {
		// 인원수만 알고 싶을 getter 메서드 사용
		// public 사용
		// count가 static이기 때문에 여기 메서드도 static 사용
		// 클래스에 대한 전체를 보기 위해 static 사용
		return count;	// getter는 return 필요, void 사용 x
	}
}


public class EmployeeMain {

	public static void main(String[] args) {
//		Employee e1 = new Employee ("김그린", 15000);		// 객체생성
//		Employee e2 = new Employee ("이자바", 20000);		// 객체생성
//		Employee e3 = new Employee ("김하하", 28000);		// 객체생성
		
//		밑에와 결과는 같음
		
		Employee e1, e2, e3;
		e1 = new Employee ("김그린", 15000);		
		e2 = new Employee ("이자바", 20000);		
		e3 = new Employee ("김하하", 28000);
		
		e1 = null;
		System.gc(); // 가비지 컬렉터를 강제 소환하는 메서드
		
		System.out.println("현재 직원수 : " + Employee.getCount());
	}

}
