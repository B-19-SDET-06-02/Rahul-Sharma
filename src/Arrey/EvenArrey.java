package Arrey;

import java.util.Scanner;

public class EvenArrey {
	int[] num = new int[5];
	int counter;

	public void even() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 5 values");
		for (counter = 0; counter < num.length; counter++) {
			num[counter] = sc.nextInt();
		}
		for (int i = 0; i < num.length; i++) {
			if (num[i] % 2 == 0) {
				System.out.println("It is a Even number\t" + num[i]);

			} else {
				System.out.println("It is a Odd number\t" + num[i]);
			}
		}
	}

	public static void main(String[] arg) {
		EvenArrey odd = new EvenArrey();
		odd.even();
	}
}
