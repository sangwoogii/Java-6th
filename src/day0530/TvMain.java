package day0530;

class MyTv {
	private boolean IsPowerOn; // 전원
	private int Channel; // 채널
	private int Volume; // 볼륨
	
	private int prevChannel; // 이전 채널
	
	final int MAX_VOLUME = 100; // 상수 설정 (대문자)
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	
	// 문제
	// MyTv 클래스의 멤버변수 isPowerOn, channel, volume은
	// 클래스 외부에서 접근할 수 없음
	// 이 멤버 변수들의 값을 '어디서나 읽고 변경'할 수 있도록
	// getter와 setter 메서드를 추가하시오.
	// 매개변수가 있는 메서드는 반드시 작업 전에 넘겨받은 값의
	// '유효성 검사'를 실시할 것.
	
	// 이전 채널로 이동하는 기능의 메서드를 추가하시오
	// 메서드명 : gotoPrevChannel
	// 기능 : 채널이 바뀌기 전에 현재 채널을 이전 채널로 변경한다.
	// 반환타입 : 없음
	// 매개변수 : 없음
	
	
	// getter : getter는 값을 읽어오는 역할을 하기 때문에 반환값이 필요함
	// -> 그렇게 때문에 void를 사용하지 않음
	
	// setter : setter는 값을 수정하는 역할을 하기 때문에 반환값이 필요없음
	// -> void를 사용함
	
	// getter : void 사용 x
	// setter : void 사용 o
	
	public boolean getIsPowerOn() {
		return IsPowerOn;
	}
	
	public void setPowerON() {
		if (IsPowerOn != true) {
			IsPowerOn = true;
		}
	}
	
	public int getVolume() {
		return Volume;
	}
	
	
	public int getChannel() {
		return Channel;
	}
	
	
	public void setVolume(int Volume) {
		if (Volume > MAX_VOLUME || Volume < MIN_VOLUME) {
			return;  // return false랑 같음
		}
		this.Volume = Volume;
	}
	
	
	public void setChannel(int Channel) {
		if (Channel > MAX_CHANNEL || Channel < MIN_CHANNEL) {
			return; // return false랑 같음
		}
		prevChannel = this.Channel; 
		// 현재 채널을 이전 채널에 저장
		// 이전채널을 저장하는 것은 채널에 관련된 것이기 때문에 setChannel 메서드에 입력
		this.Channel = Channel;
	}

	
	
	public void gotoPrevChannel () {
		setChannel(prevChannel);
	}
	
}



public class TvMain {

	public static void main(String[] args) {
		
		MyTv t = new MyTv();
		t.setChannel(10);
		System.out.println("현재 Channel : " + t.getChannel());
		
		t.setChannel(30);
		System.out.println("변경된 Channel : " + t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("prevChannel (이전채널) : " + t.getChannel());
		
		t.setVolume(20);
		System.out.println("Volume : " + t.getVolume());
	}

}
