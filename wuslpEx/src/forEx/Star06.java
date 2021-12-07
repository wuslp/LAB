package forEx;

public class Star06 {

	public static void main(String[] args) {
       // 상단
		for(int i=1; i<6; i++) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

       // 하단 
		for(int i=4; i>0; i--) {
			for(int j=0; j<i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}	
	}
}