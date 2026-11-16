//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab08c
{
	public static void main( String args[] ) throws IOException
	{
		//add more test cases		
      
      Scanner scan = new Scanner("lab08c.dat");
      Relatives RList = new Relatives();
      
      int num = scan.nextInt();
      scan.nextLine();      
      
      while(scan.hasNext())
      {
         RList.setPersonRelative(scan.nextLine());
      
      }
      
      
	}
}

