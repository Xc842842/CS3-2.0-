//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab13a
{
	public static void main ( String[] args )
	{
		//add test cases		
      StackTester s = new StackTester("a b c d e f g h i");
      out.println(s);
      out.println("popping all items from the stack");
      s.popEmAll();
      out.println("\nstack: " + s);
	}
}


