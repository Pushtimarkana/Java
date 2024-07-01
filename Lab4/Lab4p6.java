import java.util.*;
public class Lab4p6{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);

		System.out.println("enter a string");
		String a=sc.nextLine();
		int i=0;
		while(i<a.length()){
			System.out.println(a.substring(0,i+1));
			i++;
		}
	}
}