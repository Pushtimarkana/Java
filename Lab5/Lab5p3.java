import java.util.*;
class Vowel{
	String str;
	public void countEachVowel(String str){
		this.str=str;
		int acount=0,ecount=0,icount=0,ocount=0,ucount=0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)=='a'){
				acount++;
			}
			else if(str.charAt(i)=='e'){
				ecount++;
			}
			else if(str.charAt(i)=='i'){
				icount++;
			}
			else if(str.charAt(i)=='o'){
				ocount++;
			}
			else if(str.charAt(i)=='u'){
				ucount++;
			}
		}
		System.out.println("a="+acount);
		System.out.println("e="+ecount);
		System.out.println("i="+icount);
		System.out.println("o="+ocount);
		System.out.println("u="+ucount);

	}
}
public class Lab5p3{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		while(true){
			System.out.println("enter a sentence:");
			String str=(sc.nextLine()).toLowerCase();
			if(str.equals("quits")){
				break;
			}
			else{
				Vowel v1=new Vowel();
				v1.countEachVowel(str);
			}
		}
	}
}