
public class numbersinstring {
	public static void main(String[] args) {
		
	
	String s="srujana123";
	char c[]=s.toCharArray();
	for(char ch: c)
	{
		if(Character.isDigit(ch))
		{
			System.out.println(ch);
		}
	}

}
}