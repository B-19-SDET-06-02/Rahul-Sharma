package Stringdemo;



public class SamePositionRev {
String s=new String("Rahul Sharma");
String rev1=new String();
String rev2=new String();
String st[];
int count;
public void str()
{
	st=s.split(" ");
	for(int i=st[0].length()-1;i>=0;i--)
	{
		rev1=rev1+st[0].charAt(i);
	}
	for(int i=st[1].length()-1;i>=0;i--)
	{
		rev2=rev2+st[1].charAt(i);
	}
	System.out.println(rev1+" "+rev2);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SamePositionRev oo=new SamePositionRev();
		oo.str();

	}

}





