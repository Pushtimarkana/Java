import java.io.*;
public class Lab10p3{
	public static void main(String[] args) {
		int count=0;
		String fName=new String(args[0]);
		try{
			FileInputStream fis =new FileInputStream(fName);
			int temp=fis.read();
			
			while(temp>0){
				if(temp==5){
					count++;
				}
				//System.out.print((char)temp);
				temp=fis.read();
			}
			System.out.println("number 5 is="+count);
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}