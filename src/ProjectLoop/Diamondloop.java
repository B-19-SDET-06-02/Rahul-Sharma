package ProjectLoop;

public class Diamondloop {
	

		public void diamond() {
			for (int i = 3; i >= 1; i--) {
				for (int j = 1; j < i; j++) {
					System.out.print(" ");
				}
				for (int k = 3; k >= i; k--) {
					System.out.print("*");
				}
				for (int m = 3; m > i; m--) {
					System.out.print("*");
				}

				System.out.println();
			}
			for (int i = 1; i <= 2; i++) {
				for (int j = 1; j <= i; j++) {
					System.out.print(" ");
				}
				for (int k = 2; k >= i; k--) {
					System.out.print("*");
				}
				for (int m = 3; m >= i + 2; m--) {
					System.out.print("*");
				}
				System.out.println();
			}
		}
public static void main(String [] arg) {
	Diamondloop oji=new Diamondloop();
	oji.diamond();
}
}


