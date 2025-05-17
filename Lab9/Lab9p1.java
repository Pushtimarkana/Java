import java.util.*;
public class Lab9p1{
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		// t1.start();
		MyThread2 t2=new MyThread2();
		// t2.start();
		Thread th1=new Thread(t1);
		th1.run();
	
		} 
	}

class MyThread1 implements Runnable{
	public void run(){
		
		try{
			
			for(int i=0;i<10;i++){
				System.out.println("Good Morning");
				Thread.sleep(1000);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class MyThread2 implements Runnable{
	public void run(){
		
		try{
			for(int i=0;i<10;i++){
				System.out.println("Good Afternoon");
				Thread.sleep(3000);
			}

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}