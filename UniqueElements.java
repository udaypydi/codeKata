import java.util.*;
import java.lang.*;
import java.io.*;

public class UniqueElements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		HashSet<Integer> uniqueInteger = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		for(int  i = 0; i < numberOfElements; i++) {
			int element  = scan.nextInt();
			if (!uniqueInteger.add(element)) {
				uniqueInteger.remove(element);
			}
		}

		System.out.println(uniqueInteger.iterator().next());
	}
}
