import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		
		Map<Character, Integer> ap=new HashMap<>();
		String s="testleaf";
		char c[]=s.toCharArray();
		for(char ch:c)
		{
			if(ap.containsKey(ch))
			{
				ap.put(ch,ap.get(ch)+1);
			}
			else
			{
				ap.put(ch, 1);
			}
		}
		System.out.println(ap);
	
}}
