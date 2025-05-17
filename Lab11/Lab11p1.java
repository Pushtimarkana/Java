Change your start page? … Currently it's set to Home. You can change it anytime in Settings.
import java.io.*;
class Student{
	String name;
	int roll;
	public Student(String name,int roll){
		this.name=name;
		this.roll=roll;
	}
	public String toString(){
		return "name="+name+ "roll="+roll;
	}
}
public class Lab11p1{
	public static void main(String[] args) {
		String fileName="l_11.txt";
		try{
			BufferedWriter bw=new BufferedWriter(new FileWriter(fileName));
			bw.write("pushti,141\n");
			bw.write("tanisha,133\n");
			bw.write("riva,134\n");
			bw.close();
			System.out.println("file is written succesfully");
		}catch(Exception e){
			e.printStackTrace();
		}
		try{
			BufferedReader br=new BufferedReader(new FileReader(fileName));
			String line;
			while((line=br.readLine())!=null){
				String temp[]=line.split(",");
				String name=temp[0];
				int roll=Integer.parseInt(temp[1]);
				Student s1=new Student(name,roll);
				System.out.println(s1);
				// System.out.println(temp[0]);
				// System.out.println(temp[1]);
				
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}