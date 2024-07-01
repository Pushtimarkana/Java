import java.util.*;
public class Lab4p2{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a string");
		String str=nextLine();
		int count=0,c2=0;
		for(int i=0;i<str.length();i++){
		int a="aeiou".indexof(str.charAt(i));
			if(a>0){
				count++;
			}
			else{
				c2++;
			}
		}
	}
}