package com.fastcampus.ch2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 1. 원격 호출 가능한 프로그램으로 등록 
public class TwoDice {
	
	@RequestMapping("/rollDice") // 2. url과 메서드 연결 
	
	// 3. 브라우저로 출력하기 위해 HttpServletResponse response 객체 필요
	public void main(HttpServletResponse response)throws IOException { 
		// 주사위 사진 (resources/img/dice1.jpg) 랜덤으로 나오게 하기. 
		int idx1 = (int)(Math.random()*6)+1;
		int idx2 = (int)(Math.random()*6)+1;
		
		
		//4.
		response.setContentType("text/html");	
		response.setCharacterEncoding("utf-8"); 
		PrintWriter out = response.getWriter();
		out.println("<html>"); 
		out.println("<head>"); 
		out.println("</head>");
		out.println("<body>");
		out.println("<img src='resources/img/dice"+idx1+".jpg'>");	// 랜덤으로 주사위 나오게 하기.	
		out.println("<img src='resources/img/dice2.jpg'>");		
		out.println("</body>"); 
		out.println("</html>"); 
	}
}
