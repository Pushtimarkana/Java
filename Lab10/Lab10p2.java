import java.io.*;
public class Lab10p2{
	public static void main(String[] args) {
		// File myFile=new File("l10p2.txt");
		// File myFile2=new File("l10p2copy.txt");
		int no_of_rep=0;
		try{
			FileOutputStream fos =new FileOutputStream("l10p2.txt");
			String temp="This is a class A";
			for(int i=0;i<10;i++){
				byte[] byteArray=temp.getBytes();
				fos.write(byteArray);	
			}
			String temp2=temp.replace("A","B");
			// System.out.println(temp2);
			FileOutputStream fos2=new FileOutputStream("l10p2copy.txt");
			for(int i=0;i<10;i++){
				byte[] byteArray=temp2.getBytes();
				fos2.write(byteArray);
				no_of_rep++;	
			}
			fos.close();
			fos2.close();
			System.out.println("no od replacement is="+no_of_rep);

		}catch(Exception e){
			e.printStackTrace();
		}
	}
}