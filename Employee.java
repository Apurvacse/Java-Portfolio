package emp;
mport java.util.Scanner;
public class Employee {
	short empId;
	public int expYears;
	String empName;
	public float salary;
	public  Employee() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter employee number...");
		empId=Short.parseShort(sc.next()); System.out.println("Enter employee Name...");
		empName=sc.next();
		System.out.println("Enter employee Gross salary...");
		salary=Float.parseFloat(sc.next());
		System.out.println("Enter employee years of experience...");
		expYears=Integer.parseInt(sc.next());
	}
	public void getEmployee () {
		System.out.println(empId+"\t"+empName+"\t"+expYears+"\t"+salary);
	}
}