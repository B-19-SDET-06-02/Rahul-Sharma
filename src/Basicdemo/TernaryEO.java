package Basicdemo;



	import java.util.Scanner;

	public class TernaryEO {

	

		public static void main(String[] args) {
			int num1 = 85;
			int num11;
			{
				System.out.println("Entre your value:");
			}
			Scanner sc = new Scanner(System.in);
			num11 = sc.nextInt();

			String result = (num1 % 2 == 0) ? "Even number" : "Odd number";

			{
				System.out.println("Result :" + result);

			}
		}

	}

