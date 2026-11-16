//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class SpanishToEnglish
{
	private Map<String,String> pairs;

	public SpanishToEnglish()
	{
   pairs = new TreeMap<>();
	}

	public void putEntry(String entry)
	{
		String[] list = entry.split(" ");
      String english = list[1];      
      String spanish = list[0];
      pairs.put(spanish, english);
	}

	public String translate(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";

      while(chop.hasNext())
      {
         String word = chop.next();
         
         if(pairs.containsKey(word))
         { 
         output += pairs.get(word) + " ";
         }
         else
         {
         output += word + " ";
         }
      }

		return output;
	}

	public String toString()
	{
		return pairs.toString().replaceAll("\\,","\n");
	}
}

