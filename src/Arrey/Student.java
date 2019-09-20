package Arrey;

import java.util.Scanner;

public class Student {

	int rollno[] = new int[2];
	String name[] = new String[2];
	int english[] = new int[2];
	int hindi[] = new int[2];
	int total[] = new int[2];
	double Avg[] = new double[2];
	int counter;
	Scanner sc = new Scanner(System.in);

	public void repot() {
		for (counter = 0; counter < 2; counter++) {
			System.out.println("Student roll");

			rollno[counter] = sc.nextInt();

			System.out.println("Student name ");
			name[counter] = sc.next();

			System.out.println("English");

			english[counter] = sc.nextInt();

			System.out.println("hindi");

			hindi[counter] = sc.nextInt();

			total[counter] = english[counter] + hindi[counter];
			Avg[counter] = total[counter] / 2;
		}

	}

	public void Result()

	{
		System.out.println("Rollno\tName\tEnglish\tHindi\tTotal\tAverage");
		for (counter = 0; counter < 2; counter++) {
			System.out.println("" + rollno[counter] + "\t" + name[counter] + "\t" + english[counter] + "\t"
					+ hindi[counter] + "\t" + total[counter] + "\t" + Avg[counter]);

		}
	}

	public static void main(String[] args) {
		Student obb = new Student();
		obb.repot();
		obb.Result();

	}

}
