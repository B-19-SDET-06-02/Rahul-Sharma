package ProjectLoop;



import java.util.Scanner;

public class AcesorderD {
	int []acen=new int [5];
	int counter;
	int temp;
	 Scanner sc=new Scanner(System.in);
	
	public void acenorder()
	{
		System.out.println("Entre 5 values ");
		for (counter=0;counter<acen.length;counter++)
		{
			acen[counter]=sc.nextInt();		
		}
	for (int i=0;i<acen.length;i++)
	{
		for (int j=0;j<acen.length-1;j++)
		{
			if (acen[j]>acen[j+1])
			{
				temp=acen[j];
				acen[j]=acen[j+1];
				acen[j+1]=temp;
			}
		}
	}
	for (int i=0;i<acen.length;i++)
	{
		System.out.println(acen[i]);
	}
	}
	public static void main(String[]arg)
	{
		AcesorderD sort=new AcesorderD();
		sort.acenorder();
	}
	

}



