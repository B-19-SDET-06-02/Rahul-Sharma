package ProjectLoop;



public class RightAngleTriangle {
	
	public void StarPrint()
	{		
		for (int i=1;i<=5;i++) {
			
			for (int j=i;j<=5;j++) {
				
				System.out.print("");
	}
			for (int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

public static void main(String[] arg)
{
	RightAngleTriangle oji=new RightAngleTriangle();
	oji.StarPrint();
}
}



