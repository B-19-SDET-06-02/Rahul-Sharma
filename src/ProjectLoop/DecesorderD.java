package ProjectLoop;
import java.util.Scanner;

public class DecesorderD {
	
	int []dec=new int [5];
	int counter;
	int temp;
	Scanner sc=new Scanner(System.in);

	public void decsort()
	{
		System.out.println("Enter 5 value");
		for (counter=0;counter<dec.length;counter++)
		{		
			dec[counter]=sc.nextInt();
		}
		for (int a=0;a<dec.length;a++)
		{
			for (int b=0;b<dec.length-1;b++)
			{
			if (dec[b]<dec[b+1])
			 {
				temp=dec[b];
				dec[b]=dec[b+1];
				dec[b+1]=temp;
			 }	
		 }
		}
		for (int a=0;a<dec.length;a++)
		{
			System.out.println(dec[a]);
		}
	  }
		public static void main(String[] arg)
		{
			DecesorderD sor=new DecesorderD();
			sor.decsort();
			
		}
		}






