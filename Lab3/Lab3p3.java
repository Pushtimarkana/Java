import java.util.*;
public class Lab3p3{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number for a");
		int a=sc.nextInt();
		System.out.println("enter a number for b");
		int b=sc.nextInt();
		System.out.println("enter a number for");
		int c =sc.nextInt();
		if(a>b){
			if(a>c){
				System.out.println("a is maximum");
			}
			else{
				System.out.println("c is maximum");
			}
		}
		else{
			if(b>c){
				System.out.println("b is maximum");
			}
			else{
				System.out.println("c is maximum");
			}
		}
	}
}