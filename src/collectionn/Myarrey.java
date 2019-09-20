package collectionn;


	import java.util.ArrayList;

	import collectionn.MyClass;

	public class Myarrey {
		void jcb()
		{
			ArrayList<MyClass> jk=new ArrayList<MyClass>();
			jk.add(new MyClass(1,"Rahul"));
			jk.add(new MyClass(2,"Kulveer"));
			for(MyClass o:jk)
			{
				System.out.print(o.id);
				System.out.println(o.stud);
			}
		}

		public static void main(String[] args) {
			Myarrey oo=new Myarrey();
			oo.jcb();
		}}
			// TODO Auto-generated method stub
	     
