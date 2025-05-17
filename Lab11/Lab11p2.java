Change your start page? … Currently it's set to Home. You can change it anytime in Settings.
import java.io.*;
import java.util.*;
public class Lab11p2{
	public static void main(String[] args) {
		String fileName=arg[0];
		File file=new File(fileName);
		if(!file.exixts()){
			System.out.println("file is not found");
		}
		else{
			if(file.isFile()){
				System.out.println("File Size is"+file.length());
			}
			else{
				File[] files =file.fileList();
				if(file!=null){
					for(File)
				}
			}
		}
	}
}