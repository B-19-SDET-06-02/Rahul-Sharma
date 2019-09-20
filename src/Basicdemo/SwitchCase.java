package Basicdemo;



	import java.util.Scanner;

	public class SwitchCase {
	 int num1,num2,res,choice;
	 Scanner sc=new Scanner(System. in);
			 
	 public void Entre()

	 {
		 System.out.println("Entre the Value of NUM1");
		 num1=sc.nextInt();
		 
		 System.out.println("Entre the value of NUM2");
		 num2=sc.nextInt();
				
	 }
	 public void Value()
	 {
		 System.out.println("1.ADD\t\t2.Subtract\n.3 Multiply\t.4 Divide");
		 System.out.println("Entre you choice");
	    choice=sc.nextInt();
	    
	    switch(choice)
	    { 
	    case 1:
	    	 Entre();
	         res=num1+num2;
	         System.out.println("Result of addition is:"+res);
	         break;

	    case 2:
	    	Entre();
	    	res=num1-num2;
	    	System.out.println("Result of subtraction is :"+res);
	    	break;
	    	
	    case 3:
	     Entre();
	     res=num1*num2;
	     System.out.println("Result of multiply :"+res);
	     
	     break;
	     
	    case 4 :
	    	Entre();
	    	res=num1/num2;
	    	System.out.println("result of divide :"+res);
	    	break;
	    	
	     default:
	    	 System.out.println("your choice is wrong  :");
	    	 break;
	    }
	 }

	 public static void main(String[] args) {
	         
		 SwitchCase oo=new SwitchCase();
		 oo.Value();
	     
	    }
	}



