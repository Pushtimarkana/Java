import java.util.*;
public class Lab8p1{
	public static void main(String[] args) {
		int ans=1,x,y;
		try{
			x=Integer.parseInt(args[0]);
			y=Integer.parseInt(args[1]);
			ans=(int)Math.pow(x,y);
			System.out.println("ans="+ans);
		}catch(Exception e){
			System.out.println("please enter Integer");
		}
	}
}