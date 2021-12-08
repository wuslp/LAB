package arrayEx;

public class ArrayEx02 {

	public static void main(String[] args) {
		// 배열에 저장된 값을 모두 더한 결과를 배열의 개수로 나누어서 평균을 구하는 문제. 
		
		int sum = 0;		// 총점을 저장하기 위한 변수 
		float average = 0f; // 평균을 저장하기 위한 변수 (소수점 !! float)
		
		int[] score = {100, 88, 100, 100, 90};  
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];  
		}
		average = sum / (float)score.length ; // 계산 결과를 float으로 얻기 위해 형변환 
		
		System.out.println("총점 : "+ sum);
		System.out.println("평균 : " + average);
		
	}

}
