public class Lab9p2{
	public static void main(String[] args) {
		MyThread1 t1=new MyThread1();
		t1.start();
		MyThread2 t2=new MyThread2();
		t2.start();
		
	}
}
class MyThread1 extends Thread{
	public void run(){
		try{
			for(int i=1;i<21;i++){
				if (i%2==0){
					System.out.println("even Number:"+i);
				}
				sleep(100);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}
class MyThread2 extends Thread{
	public void run(){
		try{
			for(int i=1;i<21;i++){
				if (i%2!=0){
					System.out.println("odd Number:"+i);
				}
				sleep(100);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}