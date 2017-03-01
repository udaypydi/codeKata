import java.util.*;
import java.lang.*;
import java.io.*;

public class FirstRepeatedElement {
	public static void main (String[] args) throws java.lang.Exception {
		HashSet<Integer> setOfIntegers = new HashSet<Integer>();
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		for(int  i = 0; i < numberOfElements; i++) {
			int element  = scan.nextInt();
			if (!setOfIntegers.add(element)) {
				System.out.println(element);
				break;
			}
		}

	}
}
