package Arrey;



import java.util.Scanner;

public class DupNumD {
	int[] acen = new int[5];
	int counter;
	int temp;
	Scanner sc = new Scanner(System.in);

	public void acenorder() {
		System.out.println("Entre 5 values ");
		for (counter = 0; counter < acen.length; counter++) {
			acen[counter] = sc.nextInt();
		}
		for (int i = 0; i < acen.length; i++) {
			for (int j = i + 1; j < acen.length; j++) {
				if (acen[i] == acen[j]) {
					System.out.println(acen[j]);
				}
			}
		}
	}

	public static void main(String[] arg) {
		DupNumD sort = new DupNumD();
		sort.acenorder();
	}

}



