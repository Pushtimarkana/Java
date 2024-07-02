import java.util.*;
public class Lab5p1{
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		Circle c=new Circle();
		c.radius=10;

		Circle c2=new Circle();
		System.out.println("enter radius");
		int r=sc.nextInt();
		c2.radius=r;

		double a=c.area();
		System.out.println("area of c is="+a);
		double b=c2.area();
		System.out.println("area if c2 is="+b);

	}
	 static class Circle{
		int radius;
		public double area(){
			 double ans =Math.PI*radius*radius;
			return ans;
			}
		}
}