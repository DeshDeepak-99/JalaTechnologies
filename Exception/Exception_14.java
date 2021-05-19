// A Java program to demonstrate that invoking a method
// on null causes NullPointerException
import java.io.*;

class GFG
{
	public static void main (String[] args)
	{
		String ptr = null;

	
			if (ptr.equals("gfg"))
				System.out.print("Same");
			else
				System.out.print("Not Same");
		}
}

