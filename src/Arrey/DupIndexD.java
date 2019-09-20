package Arrey;





import java.util.Scanner;

public class DupIndexD {
	int[] acen = new int[5];
	int counter;
	int temp;
	Scanner sc = new Scanner(System.in);

	public void duppos() {
		System.out.println("Entre 5 values ");
		for (counter = 0; counter < acen.length; counter++) {
			acen[counter] = sc.nextInt();
		}
		for (int i = 0; i < acen.length; i++) {
			for (int j = i + 1; j < acen.length; j++) {
				if (acen[i] == acen[j]) {
				System.out.println("Duplicate number");
			    System.out.println(acen[j]);
					System.out.println("Position of duplicate");
					System.out.println(j);
				}
				}
			}}	

	public static void main(String[] arg) {
		DupIndexD sort = new DupIndexD();
		sort.duppos();
	}

}






