package arrayEx;

public class ArrayEx04 {

	public static void main(String[] args) {
		// 카드 섞기, 로또 번호 생성
		
		int[] num = new int[45];
		
		 // 1부터 45까지 출력.
		for(int i=0; i<num.length; i++) {
			num[i] = i+1;
			System.out.print(num[i]+", ");  
		}
		System.out.println();
		
		
		// 1~45의 값 중  랜덤으로 6개만 뽑아보기 ! 
		
		for (int i=0; i<6; i++) { // 반복문으로 6번 반복.  
			int n = (int)(Math.random()*45); // 변수 n에 1~45번 숫자중 임의의 숫자 1개를 담는다. 
			int tmp = num[i];		// 임시변수 tmp에 num배열에 i번째 인덱스 번호를 임시로 담는다. 이거 컵 옮기기 비슷. 
			num[i] = num[n];		// num 배열의 i번째 인덱스에 있는 번호를 변수 n에서 생성된 1~45번째 숫자의 인덱스를 담는다. 
			num[n]= tmp;			
		}
		
		for(int i=1; i<7; i++) {
			System.out.printf("%d 번째 공의 숫자는 %d번입니다.", i, num[i]);
			System.out.println();
		}

	}

}
