package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록 
@Controller
public class Hello {
	int iv= 10; // 인스턴스 변수 
	static int cv = 20; // static변수 
	
	// 2. URL과 메서드를 연결 
	@RequestMapping("/hello")
	public void main() {  // static 없어도 됨. / 인스턴스 메서드 
		System.out.println("Hello"); // 이건 톰캣 콘솔에 출력 ? // 브라우저엔 안나옴
		
	}
	
	public static void main2(){ //static 메서드 - cv만 사용가능
		
	}
}
