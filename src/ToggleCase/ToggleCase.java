package ToggleCase;

import java.util.Scanner;

public class ToggleCase {
	
	public static String togglecase(String s)
	{
		char charArrayOfString[] = s.toCharArray();
	    for (int i = 0 ; i < charArrayOfString.length ; i++)
	    {
	        charArrayOfString[i] ^= 32 ;
	    }
	    return new String(charArrayOfString);
		
	}
	
	 public static void main(String[] args) {
	    	Scanner scan = new Scanner(System.in);
			String s = scan.nextLine();
	        System.out.println(togglecase(s));
	    }

}
