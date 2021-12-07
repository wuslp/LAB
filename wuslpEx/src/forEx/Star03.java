package forEx;

public class Star03 {

	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			for(int j=4; j>=i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
