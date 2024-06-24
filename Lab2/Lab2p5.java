import java.util.*;
public class Lab2p5{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter fahernheit");
		double f = sc.nextDouble();
		double c= (f-32)*(5/9.0);
		System.out.println("celceious="+c);

	}
}