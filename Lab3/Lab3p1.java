import java.util.*;
public class Lab3p1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("enter mark 1 of student");
		int m1=sc.nextInt();
		System.out.println("enter mark 2 of student");
		int m2=sc.nextInt();
		System.out.println("enter mark 3 of student");
		int m3=sc.nextInt();
		System.out.println("enter mark 4 of student");
		int m4=sc.nextInt();
		System.out.println("enter mark 5 of student");
		int m5=sc.nextInt();

		double a=(m1+m2+m3+m4+m5)/5.0;
		System.out.println("percentage ="+a);
		if(a>=60){
			System.out.println("first division");
		}
		else if(a>=50){
			System.out.println("second division");
		}
		else if(a>=40){
			System.out.println("third division");
		}
		else if(a<40){
			System.out.println("you are fail");
		}
	}
}