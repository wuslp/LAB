package chapter06;

// 자바의 정석 54  
// 메인 메서드가 있는 클래스를 소스파일 이름과 동일하게 해줘야 한다. 
class Ex6_1 {

	public static void main(String[] args) {
		Tv t; 
		t= new Tv();
		t.channel =7;
		t.channelDown();
		System.out.println("현재 채널은 "+t.channel+"입니다.");

	}

}

class Tv{
	String color;
	boolean power;
	int channel;
	
	// Tv의 기능 (메서드)
	void power() {power = !power;}
	void channelUp() { ++channel;}
	void channelDown() { --channel;}
	
}


