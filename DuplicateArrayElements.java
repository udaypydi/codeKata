import java.util.*;
import java.lang.*;
import java.io.*;

publc class DuplicateArrayElements
{
	public static void main (String[] args) throws java.lang.Exception
	{
		HashSet<Integer> registerationNumber = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int numberOfInputs = scan.nextInt();
		for(int i = 0; i < numberOfInputs; i++) {
			int n = scan.nextInt();
			if (!registerationNumber.add(n)) {
				System.out.print(n);
			}
		}
	}
}
