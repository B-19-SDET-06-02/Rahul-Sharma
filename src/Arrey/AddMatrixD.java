package Arrey;
import java.util.Scanner;
public class AddMatrixD {
	

	
		int[][] mat = new int[3][3];
		int[][] nat = new int[3][3];
		int[][] total = new int[3][3];
		int counter;

		public void tarrey() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Entre the values");

			for (int counter = 0; counter < 3; counter++) {
				for (int i = 0; i < 3; i++) {
					mat[counter][i] = sc.nextInt();
					nat[counter][i] = sc.nextInt();
					total[counter][i] = mat[counter][i]+nat[counter][i];

				}
			}
		}

		public void sub() {
			System.out.println("\tSum Matrix");
			for (counter=0;counter<3;counter++)
	{ for (int i=0;i<3;i++)
		
	{
	        
			System.out.print("\t"+total[counter][i]);
		}
	       System.out.println();
	}}

		public static void main(String[] arg) {
			AddMatrixD obb = new AddMatrixD();
			obb.tarrey();
			obb.sub();
		}
	}


