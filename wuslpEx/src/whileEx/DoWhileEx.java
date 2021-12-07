package whileEx;
import java.util.*;

public class DoWhileEx {

	public static void main(String[] args) {
		// 숫자 맞추기 ! 

		int input =0, answer=0;
		
		answer=(int)(Math.random()*100)+1; // 1~100사이의 임의의 수를 저장 
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("1과 100사이의 정수를 입력하세요.");
			input=sc.nextInt();
			
			if(input>answer) {
				System.out.println("더 작은 수를 입력하세요.");
			}else if(input<answer){
				System.out.println("더 큰 수를 입력하세요.");	
			}
		}while(input!=answer); // 이 조건식이 참일 때 do 블럭이 실행된다. 
		
		System.out.println("정답입니다.");
		
	}

}
