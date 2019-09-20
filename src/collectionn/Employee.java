package collectionn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Employee {
	int option;
	Scanner sc = new Scanner(System.in);

	public void acc() {
		System.out.println("Entre your option");
		System.out.println("1.TO Add Detail\t2.To Delete Detail");
		option = sc.nextInt();
		switch (option) {
		case 1:
			ArrayList jk = new ArrayList();
			System.out.println("Entre Employee Id");
			int empid = sc.nextInt();
			jk.add(empid);
			System.out.println("Entre Employee Name");
			String name = sc.next();
			jk.add(name);
			System.out.println("Entre date of joining");
			String doj = sc.next();
			jk.add(doj);
			System.out.println("Entre Salary");
			double salary = sc.nextDouble();
			jk.add(salary);
			Iterator it = jk.iterator();
			while (it.hasNext()) {
				System.out.println(it.next());
			}
			
			
			break;
		case 2:
			ArrayList a = new ArrayList();
			System.out.println("Entre Employee Id");
			int empid1 = sc.nextInt();
			a.add(empid1);
			System.out.println("Entre Employee Name");
			String name1 = sc.next();
			a.add(name1);
			System.out.println("Entre date of joining");
			long doj1 = sc.nextLong();
			a.add(doj1);
			System.out.println("Entre Salary");
			double salary1 = sc.nextDouble();
			a.add(salary1);
			System.out.println(a);
			System.out.println("Entre the index number to delete");
			int removee = sc.nextInt();
			a.remove(removee);
			// System.out.println(a);
			Iterator iter = a.iterator();
			while (iter.hasNext()) {
				System.out.println(iter.next());
			}
		default:
			System.out.println("Invalid Entry");
		}
	}

	public static void main(String[] args) {
		Employee oo = new Employee();
		oo.acc();
		// TODO Auto-generated method stub

	}

}
