import java.util.*;
class Member{
	String name;
	int age;
	int phonenumber;
	String address;
	float salary;
	public void printSalary(){
		System.out.println("salary is="+salary);
	}

}
class Employee extends Member{
	String specialization;
}
class Manager extends Member{
	String department;
}
public class Lab6p3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employee e1=new Employee();
		System.out.println("enter Employee name:");
		e1.name=sc.nextLine();
		System.out.println("enter Employee address:");
		e1.address=sc.nextLine();
		System.out.println("enter Employee specialization:");
		e1.specialization=sc.nextLine();
		System.out.println("enter Employee age:");
		e1.age=sc.nextInt();
		System.out.println("enter Employee phonenumber:");
		e1.phonenumber=sc.nextInt();
		System.out.println("enter Employee salary:");
		e1.salary=sc.nextFloat();

		e1.printSalary();
		System.out.println("specialization : "+e1.specialization);


		Manager m1=new Manager();
		System.out.println("enter Manager name:");
		m1.name=sc.nextLine();
		System.out.println("enter Manager address:");
		m1.address=sc.nextLine();
		System.out.println("enter Manager department:");
		m1.department=sc.nextLine();
		System.out.println("enter Manager age:");
		m1.age=sc.nextInt();
		System.out.println("enter Manager phonenumber:");
		m1.phonenumber=sc.nextInt();
		System.out.println("enter Manager salary:");
		m1.salary=sc.nextFloat();

		m1.printSalary();
		System.out.println("department : "+m1.department);


	}
}