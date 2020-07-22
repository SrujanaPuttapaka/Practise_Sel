package sruj;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FRFW  {
	public static void main(String[] args) throws IOException {
	
	
	FileReader fr = new FileReader("C:\\Users\\sputtapaka\\Desktop\\changes.txt");
	int i;
	while((i=fr.read())!=-1)
	{
		System.out.print((char)i);
	}
	
	FileWriter fw =new FileWriter("C:\\Users\\sputtapaka\\Desktop\\changes.txt");
	String s="srujana"+"ana"+"put";
			for(int j=0;j<s.length();j++)
			{
				fw.write(s.charAt(j));
			}
			
	fw.close();
	}
}
