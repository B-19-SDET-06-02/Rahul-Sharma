package Arrey;
import java.util.Scanner;
public class SimpleArrey {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int [] rollno=new int [5];
			int counter;
			int n;
			Scanner sc=new Scanner(System.in);
			for (counter=0;counter<5;counter++)
			{
			rollno[counter]=sc.nextInt();
			}
			for(n=0;n<5;n++)
			{	System.out.println(rollno[n]);
			}
		}

	}

