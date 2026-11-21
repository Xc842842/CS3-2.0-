//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -
import static java.lang.System.out;

public class Lab13c
{
	public static void main ( String[] args )
	{
		//add test cases


		String testcase = "7 8 + 2 -";
		out.println(ExpressionSolver.solvePostfix("7 8 + 2 -"));

		out.println(ExpressionSolver.solvePrefix("+ + 2 7 + 1 2"));

		out.println(ExpressionSolver.solvePrefix("- 1 + 2 + 3 4"));
	}
}
