package abstraction;

import java.util.Scanner;

public class DemoExpection {
	double a, b, res,res1;
	Scanner sc = new Scanner(System.in);

	public void jcc()
   {
		try
   {
			System.out.println("Entre the value of a");
			a=sc.nextInt();
			 System.out.println("Entre the value of b");
			b=sc.nextInt();			
	         res= Math.sqrt(a);
	         res1=a/b;
	 System.out.println(res);
	System.out.println(res1); 
   }
   catch(ArithmeticException e)  
   {
	 System.out.println("Denominator must be greater than Numinator");
	 System.out.println("Enter valid number");  
   }}
		

	

		public static void main(String[]arg)
		{
			DemoExpection oo=new DemoExpection();
			oo.jcc();
		}
}
