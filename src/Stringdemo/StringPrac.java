package Stringdemo;





	public class StringPrac {
	String name=new String("Rahul");
	String fname="sharma";
	int a=5;
	char a1='y';
	public void print()
	{
	System.out.println(name+a+a1);
	fname=name.concat(fname);
	System.out.println(fname);
	a1=name.charAt(0);
	System.out.println(a1);
	name="prakhar";
	System.out.println(name);

	}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	   StringPrac oo=new StringPrac();
	   oo.print();
		}

	}





