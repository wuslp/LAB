package com.fastcampus.ch2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// 1. 원격 호출 가능한 프로그램으로 등록 
@Controller
public class Hello {
	int iv= 10; // 인스턴스 변수 
	static int cv = 20; // static변수 
	
	// 2. URL과 메서드를 연결 
	@RequestMapping("/hello") //hello 라는 URL과 main 메소드 연결. (접근제어자 상관 X)
	private void main() {  
		// static 없어도 됨. -> 인스턴스 메서드이기 때문. 톰캣이 객체 생성? - iv, cv 둘다 사용 가능. 
		// public이 아닌 private 이라도 가능.
		System.out.println("Hello-private"); // sysout 이건 톰캣 콘솔에 출력 ? // 브라우저엔 안나옴
		System.out.println(cv); // ok 
		System.out.println(iv); // ok 
		
	}
	
	public static void main2(){ //static 메서드 - cv만 사용가능
		System.out.println(cv); // ok
//		System.out.println(iv); // 에러 
	}
}
