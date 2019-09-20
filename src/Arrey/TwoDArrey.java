
package Arrey;

import java.util.Scanner;

public class TwoDArrey {
	int [][]mat=new int[3][3];
    
    public void tarrey()
	 {
		Scanner sc=new Scanner(System.in);
	 System.out.println("Entre the values");
	 System.out.println("");
	 for (int i=0;i<3;i++)
	 {
		 for (int j=0;j<3;j++)
		 {
		
			 mat[i][j]=sc.nextInt();
	 }}
	 System.out.println("\tMatrix");
for (int i=0;i<3;i++)
{
	for (int j=0;j<3;j++)
	{
		System.out.print("\t"+mat[i][j]);
	}System.out.println();
}
}
	
	
	public static void main(String[]arg)
	{
		TwoDArrey oji=new TwoDArrey();
		oji.tarrey();
	}
}