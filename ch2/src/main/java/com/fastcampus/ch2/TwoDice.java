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
		//4.
		response.setContentType("text/html");	
		response.setCharacterEncoding("utf-8");
		PrintWriter out = response.getWriter();
		out.println("<html>"); 
		out.println("<head>"); 
		out.println("</head>");
		out.println("<body>"); 
		out.println("</body>"); 
		out.println("</html>"); 
	}
}
