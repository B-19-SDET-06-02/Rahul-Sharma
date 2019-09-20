package Arrey;



import java.util.Scanner;

public class FindNumD {
	int[] num1 = { 13, 19, 75, 65, 35 };
	int n, i, l;
	Scanner sc = new Scanner(System.in);

	public void pos() {
		System.out.println("Entre the value");

		n = sc.nextInt();

		for ( i = 0; i < num1.length; i++) {
			if (num1[i] == n) {
				System.out.print(i);
		l=i	;	
			}}
		     if (num1[l]!=0) 
			{
				System.out.println("this number is not match");
			}
		}
	

	public static void main(String[] arg) {
		FindNumD oji = new FindNumD();
		oji.pos();
	}

}



