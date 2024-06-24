import java.util.Scanner;
public class Lab2p3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter = ");

		char i = sc.next().charAt(0);
		if(i== '+'){
			System.out.println("enter a :");
			float a = sc.nextInt();
			System.out.println("enter b :");
			float b = sc.nextInt();
			System.out.println(a+b);
		}

			else if(i== '-'){
			System.out.println("enter a :");
			float a = sc.nextInt();
			System.out.println("enter b :");
			float b = sc.nextInt();
			System.out.println(a-b);
		}
			else if(i== '*'){
			System.out.println("enter a :");
			float a = sc.nextInt();
			System.out.println("enter b :");
			float b = sc.nextInt();
			System.out.println(a*b);
		}
			else{
			System.out.println("enter a :");
			float a = sc.nextInt();
			System.out.println("enter b :");
			float b = sc.nextInt();
			System.out.println(a/b);
		}
	}
}