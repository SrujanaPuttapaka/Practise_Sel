import net.bytebuddy.implementation.ToStringMethod;

public class DupInString {
public static void main(String[] args) {
	String str="srujanasrujana";
	String temp=" ";
	int len=str.length();
	
	for(int i =0;i<len;i++)
	{
		int count=1;
		if(temp.contains(Character.toString(str.charAt(i))))
		{
			continue;
		}
		else
		{
			for(int j=i+1;j<len;j++)
			{
				if(str.charAt(i)==str.charAt(j))
				{
					count++;
				}
				
			}
			System.out.println(str.charAt(i)+" No of charecters are: " +count);
			temp=temp+str.charAt(i);
		}
	}
}
}
