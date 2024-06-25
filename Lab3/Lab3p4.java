import java.util.*;
public class Lab3P4{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//string prime or not
		System.out.println("enter a string");
		String str=sc.nextLine();
		int s=0,end=str.length()-1;

		while(s!=str.length()/2){
			if(str.charAt(s)!=str.charAt(end)){
				System.out.println("string is not pailndrom");
				break;
			}
			else{
				System.out.println("string is pailndrom");
				s++;
				end--;
				break;
			}
		}
	}
}