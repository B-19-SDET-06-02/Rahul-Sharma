package Arrey;
import java.util.Scanner;
public class SizeD {

	int []arr;
	int n;
	public void darrey()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Entre the size");
		
		n=sc.nextInt();

		arr=new int[n];
		System.out.println("Enter the value");
		for (int counter=0;counter<arr.length;counter++)
		{
			arr[counter]=sc.nextInt();
		}
		for (int i=0;i<arr.length;i++)
		{
			if (arr[i]%2==0)
			{
		    System.out.println(arr[i]+"\t is a Even number");
				
			}
			else
			{System.out.println(arr[i]+"\t is a Odd number");
		}}
		}
	public static void main(String[]arg)
	{
		SizeD oji=new SizeD();
		oji.darrey();
	}}
		
	
	





