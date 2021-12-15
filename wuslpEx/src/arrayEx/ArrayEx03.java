package arrayEx;

public class ArrayEx03 {

	public static void main(String[] args) {
		// 배열에 저장된 값 중에서 최대값과 최소값을 구하자. 
		
		int[] score= {79, 88, 91, 33, 100, 55, 95};
		
		int max = score[0]; // 배열의 첫번째 값으로 초기화. 
		int min = score[0];
		
		for(int i=1; i<score.length; i++) { // 배열의 두 번째 요소부터 읽기 위해 변수 i의 값을 1로 초기화 했다. 
			if(score[i] > max) {
				max = score[i];
			}else if(score[i] < min) {
				min = score[i]; 
			}
		} // for문 종료
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);

	}

}
