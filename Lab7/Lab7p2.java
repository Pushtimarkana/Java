import java.util.*;
interface A{
	final static int a=10;
	public void a();
}
interface A1 extends A{
	 final static int a1=15;
	 public void a1();

}
interface A2 extends A{
	final static int a2=20;
	public void a2();

}
interface A12 extends A1,A2{
	final static int a12=30;
	 public void a12();
}
class B implements A12{
	public void a(){
		System.out.println("a="+a);
	}
	public void a1(){
		System.out.println("a1="+a1);
	}
	public void a2(){
		System.out.println("a2="+a2);
	}
	public void a12(){
		System.out.println("a12="+a12);
	}
}
public class Lab7p2{
	public static void main(String[] args) {
		B b1=new B();
		b1.a();
		b1.a1();
		b1.a2();
		b1.a12();
		
	}
}