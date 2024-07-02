import java.util.*;
class Time{
	int hour;
	int min;

	public Time(int hour,int min){
		this.hour=hour;
		this.min=min;
	}	
	public void addTime(Time t1,Time t2){
		this.hour=t1.hour+t2.hour;
		this.min=t1.min+t2.min;
		if(this.min>59){
			this.hour+=1;
			this.min=this.min-60;
		}
	}
}
public class Lab5p2{
	public static void main(String[] args) {
		Time t1=new Time(2,50);
		Time t2=new Time(6,30);
		Time t3=new Time(0,0);

		t3.addTime(t1,t2);
		System.out.println(t3.hour);
		System.out.println(t3.min);
	}
}