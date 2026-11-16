//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;

public class Histogram
{
	private Map<String,Integer> histogram;
   private String[] splitStr;
	public Histogram()
	{
   
   histogram = new TreeMap<>();
	}

	public Histogram(String sent)
	{
   setSentence(sent);
	}
	
	public void setSentence(String set)
	{
   histogram = new TreeMap<String, Integer>();
   Scanner scan = new Scanner(set);
   
   while(scan.hasNext())
   {
      String word = scan.next();
      if(histogram.containsKey(word))
      {
         histogram.put(word, histogram.get(word)+1);
      
      }
   
      else
      {
         histogram.put(word, 1);
      }
   
   }
         
	}

	public String toString()
	{
   
		String output="" ;
	   String[] list = new String[histogram.size()];
      
      for(String s : histogram.keySet())
      {
         output+= s + " - " + histogram.get(s) + "\n";
      }
   	String allStars="";
		return output+"\n\n";
	}
}

