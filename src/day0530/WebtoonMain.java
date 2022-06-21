package day0530;

// 아래의 웹툰 목록을 객체화하여 출력 결과와 같은 결과값을 나타내시오.
// 웹툰 목록
// 		제목 : 나혼자만 레벨업!   장르 : 판타지 	 작가 : 나혼자
//		제목 : 스위트 집 	     장르 : 스릴러 	 작가 : 김달콤
//		제목 : 이태원 클래식	 장르 : 드라마 	 작가 : 이태원

// 출력 예
// Webtoon { 제목 : 나혼자만 레벨업!  장르 : 판타지 	 작가 : 나혼자 }
// Webtoon { 제목 : 스위트 집 	     장르 : 스릴러 	 작가 : 김달콤 }
// Webtoon { 제목 : 이태원 클래식	 장르 : 드라마 	 작가 : 이태원 }
// 총 웹툰의 수 : 3 (static 사용)

class Webtoon {

	private String title;
	private String genre;
	private String author;
	private static int count = 0; // 멤버 (필드) 선언
	
	public Webtoon (String title, String genre, String author) {
		this.title = title;
		this.genre = genre;
		this.author = author;
		Webtoon.count++;
		// 객체를 생성할 때 카운트가 1씩 증가해야하기 때문에 입력
		// Webtoon의 count인 것이라는 걸 명확하게 표현하기 위해 Webtoon 입력
	}
	
	public void print() { // 출력하는 메서드 생성+
		System.out.printf("Webtoon { 제목 : %s, 장르 : %s, 작가 : %s }\n", title, genre, author);
	}
	
	public static int getCount() {
		return count;
	}
	
	
}

public class WebtoonMain {

	public static void main(String[] args) {
		
		Webtoon levelup = new Webtoon("나혼자만 레벨업!", "판타지", "나혼자");
		Webtoon sweethouse = new Webtoon("스위트 집", "드라마", "김달콤");
		Webtoon itaewon = new Webtoon("이태원 클래식", "드라마", "이태원");
		
		levelup.print();
		sweethouse.print();
		itaewon.print();
		
		System.out.println("총 웹툰의 수 : " + Webtoon.getCount() + "권");
		
		System.out.println();
		
		
// 배열을 사용하였을 때 
	//	int a[] = {10, 20, 30}; 과 똑같은 의미
	//  Webtoon이라는 우리가 설정한 자료형에 대한 webtoons라는 변수의 값 (levelup, sweethouse, itaewon)
	//  배열의 자료형은 우리가 설정한 자료형이 된다.
//		Webtoon webtoons[] = {levelup, sweethouse, itaewon};
//		
//		for (int i=0; i<webtoons.length; i++) { 
//			webtoons[i].print();
//		}
		
	
	}

}
