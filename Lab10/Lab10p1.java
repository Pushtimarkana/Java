import java.io.*;
import java.util.*;
public class Lab10p1{
	public static void main(String[] args) {
		File mf=new File("lab10.txt");
		int wordCount=0;
		try{
			FileOutputStream fos =new FileOutputStream("lab10.txt");
			String temp="This is a class A";
			for(int i=0;i<10;i++){
				byte[] byteArray=temp.getBytes();
				fos.write(byteArray);
				// System.out.println("\n");

				Scanner sc = new Scanner(mf);
				while(sc.hasNext()){
					sc.next();
					wordCount++;
				}
			}
			fos.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		  // File myFile=new File("C:\\Users\\pusht\\OneDrive\\Desktop\\pushti\\sem2\\Java\\lab10");
		int count=0;
		try{
			FileInputStream fis =new FileInputStream("lab10.txt");
			int temp=fis.read();
			
			while(temp>0){
				System.out.print((char)temp);
				temp=fis.read();
				count++;
			}
			fis.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		int lineCount=0;
		try{
			FileReader fr=new FileReader("lab10.txt");
			BufferedReader br=new BufferedReader(fr);
			String temp;
			
			while(br.ready()){
				temp=br.readLine();
				System.out.println(temp);
				lineCount++;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("\n");
		System.out.println("wordCount is="+wordCount);
		System.out.println("character is="+count);
		System.out.println("Is myFile exist="+mf.exists());
		System.out.println("Line is="+lineCount);
	}
}