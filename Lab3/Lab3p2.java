import java.util.*;
public class Lab3p2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a=sc.nextInt();
		int temp=a;
		int r;
		int n=0,i=0;

		while(a!=0){
			
		    r=a%10;
		    i=i*10+r;
		    a=a/10;

		}
		if(temp==i){
			System.out.println("number is palindrom");
		}
		else{
			System.out.println("number is not palindrom");
		}
	}
}