package Arrey;

import java.util.Scanner;

public class ReportD {
	int report;

	public static void main(String[] args) {

		int report[] = new int[5];
		int rollno;
		Scanner sc = new Scanner(System.in);
		for (rollno = 0; rollno < report.length; rollno++)

		{
			report[rollno] = sc.nextInt();

			System.out.println(report[rollno]);

			// TODO Auto-generated method stub

		}

	}
}
