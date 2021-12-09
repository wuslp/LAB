package arrayEx;

import java.util.Arrays;

public class ArrayEx05 {

	public static void main(String[] args) {
		String[] strArr = {"가위", "바위", "보"};
		System.out.println(Arrays.toString(strArr)); // 배열에 정의된 값들을 문자열 형태로 만들어 리턴. 
		
		
		for(int i =0; i<10;i++) {
			int tmp = (int)(Math.random()*3);
			System.out.println(strArr[tmp]); //0~2
		}
	}

}
