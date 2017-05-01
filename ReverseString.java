import java.util.*;
import java.lang.*;
import java.io.*;

public class ReverseString
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan  = new Scanner(System.in);
		String inputString = scan.nextLine();
		String reverseString = new StringBuffer(inputString).reverse().toString();
		System.out.println(reverseString);
	}
}
