//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import java.util.Scanner;
import java.util.Stack;
public class ExpressionSolver
{
   /** Returns the result of applying the given operator 
       to the given operands. Only addition, subtraction,
       multiplication and division are supported.
       
       @throws UnsupportedOperationException if op isn't 
               a supported operator.
   **/
   private static double calc(double one, double two, String op) {
      
   if(op.equals("+"))
   {
      return one + two;

   }
      
   if(op.equals("-"))
   {
      return one - two;
   }

   if(op.equals("*"))
   {
      return one * two;
   }
   if(op.equals("/"))
   {
      return one / two;
   }

   throw new UnsupportedOperationException("Unsupported operator: " + op);
   }

   /*** Postfix Evaluator ***/   
   public static double solvePostfix(String expression) {
   
      Stack<Double> operands = new Stack<>();
      Scanner scan = new Scanner(expression);

      while(scan.hasNext())
      {
         String value = scan.next();

         if(isNumber(value))
         {
            operands.push(Double.parseDouble(value));
         }

         else
         {
            double one = operands.pop();
            double two = operands.pop();
            operands.push(calc(two, one, value));
         }

      }

      scan.close();

      return operands.pop();
   } 
        
   /*** Prefix Evaluator ***/   
   public static double solvePrefix(String expression) 
   {
     Stack<Double> stack = new Stack<>();
     String[] tokens = expression.trim().split("\\s+");
      Stack<String> operators = new Stack<>();

     for (int i = tokens.length - 1; i >= 0; i--) {
        String token = tokens[i];


        if (isNumber(token)) {
           stack.push(Double.parseDouble(token));
        } else 
         {
            operators.push(token);
            if(stack.size() >= 2) 
               {
                  double one = stack.pop();
                  double two = stack.pop();
                  stack.push(calc(one, two, token));
                  operators.pop();
               }
          }
         }
     return stack.pop();
      }

      
   
   //This catches both kinds of exceptions
   //that parseDouble might throw.
   public static boolean isNumber(String symbol) {
      try {
         Double.parseDouble(symbol);
         return true;
      }
      catch (NullPointerException | NumberFormatException e) {
         return false;
      }
   }
}
