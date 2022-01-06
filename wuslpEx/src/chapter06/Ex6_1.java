package chapter06;

// 자바의 정석 54  
// 메인 메서드가 있는 클래스를 소스파일 이름과 동일하게 해줘야 한다. 
class Ex6_1 {

	public static void main(String[] args) {
		Tv t; 				// Tv 인스턴스를 참조하기 위한 변수 t 선언 
		t= new Tv();		// Tv 인스턴스 생성 
		t.channel =7;		// Tv 인스턴스의 멤버변수 channel의 값을 7로 한다. 
		t.channelDown();	// Tv 인스턴스의 메서드 ChannelDown()을 호출한다. 
		System.out.println("현재 채널은 "+t.channel+"입니다.");
	}
}

class Tv {
	// Tv의 속성(멤버변수)
	String color;	// 색상 
	boolean power;	// 전원상태(on/off)
	int channel;	// 채널 
	
	// Tv의 기능 (메서드)
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}


