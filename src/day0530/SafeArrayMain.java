package day0530;

class SafeArray {
	
	private int a[];
	public int length;
	
	public SafeArray(int size) { // 매개변수가 1개 있는 생성자
		a = new int[size]; // 사용자가 입력한대로 배열값을 만들 수 있음
		length = size;
	}
	
	// 배열의 값을 반환시켜주기 위해 getter 생성
	public int getNum(int index) {
		if (index >= 0 && index < length) {
			return a[index]; // a의 index번째의 값을 반환 = 배열의 값
		}
		return -1; // get을 썼기 때문에 return값이 필요함
	}
	
	public void putNum(int index, int value) { // 매개변수 2개를 갖는 메서드
		if (index >= 0 && index < length) {
			a[index] = value;
			System.out.println(a[index]);
		} else {
			System.out.println("잘못된 인덱스 : " + index);
		}
	}
}

public class SafeArrayMain {

	public static void main(String[] args) {
		// 하나의 클래스 파일엔 하나의 클래스가 있는게 좋음
		
		SafeArray array = new SafeArray(3); // 길이 3개짜리인 array배열 생성의 의미
		
		for (int i=0; i<=array.length; i++) { // 배열의 화면 출력은 for문으로
			array.putNum(i, i*10);
		}

	}

}
