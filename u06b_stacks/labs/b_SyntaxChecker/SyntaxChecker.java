//Â© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Stack;

public class SyntaxChecker
{
   private String exp;

   public SyntaxChecker()
   {
      setExpression("");
   }

   public SyntaxChecker(String s)
   {
      setExpression(s);
   }
	
   public void setExpression(String s)
   {
      exp = s;
   
   }

   public boolean checkExpression()
   {
      //You can change this to a stack of Strings if you prefer.
      Stack<String> symbols = new Stack<String>();     
      String[] openers = {"{", "[", "<", "("};
      String[] closers = {"}", "]", ">", ")"};
      
      String letter = "";
      for(int i = 0; i < exp.length(); i++)
      {
         letter = exp.substring(i, i + 1);
         for(String o : openers)
         {
            if(letter.equals(o))
            {
               symbols.push(letter);
            }
         }
      
      
           for(String c : closers)
         {
            if(letter.equals(c))
            {  
               
               String peeker = symbols.peek();

               if(Arrays.asList(closers).indexOf(letter)== Arrays.asList(openers).indexOf(peeker))
               {
                  symbols.pop();

               }

            }



         }
         
      }
      
      if(symbols.isEmpty())
      {
         return true;
      }
      return false; 
   }


	//write a toString method

   public String toString()
   {
      if(checkExpression())
      {
         return exp + " is correct.";

      }
      return exp + " is incorrect";


   }
}

