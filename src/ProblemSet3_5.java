/**
 * INSTRUCTIONS.
 * 
 * The following exercises are, perhaps, more mathematically inclined than previous
 * problem sets. While they might be challenging, they are certainly doable.
 * 
 * You can (and should!) solve each of them using only the operators, conditional control
 * structures, and iterative control structures we've covered. You are not permitted to use
 * recursive code in your solutions.
 * 
 * Please be mindful of the expected outputs, as your code will be tested against that
 * directly. If you're unsure, please ask for clarification.
 * 
 * This problem set is worth 25 points and is due no later than 11:59pm on October 28, 2018.
 */

public class ProblemSet3_5 {
	
	public static void main(String[] args) {
		ProblemSet3_5 ps = new ProblemSet3_5();
		
		// test your solutions here
		
		ps.primes(1, 1000);
		ps.palindromicNumbers(5);
		ps.fibonacci(2);
		
	}
	
	/**
	 * How many prime numbers are there between @start and @end, where @start and @end
	 * are positive integers in the range [1, @Integer.MAX_VALUE]?
	 * 
	 * Print your solution in the following formats: "There is X prime number."
	 *                                               "There are X prime numbers."
	 * 
	 * @param start
	 * @param end
	 */
	
	public void primes(int start, int end) {	
	
			
		
	}
	
	/**
	 * What are the next @count leap years?
	 * 
	 * Print your solution in the following formats: "The next leap year is X."
	 *                                               "The next 2 leap years are X and Y."
	 *                                               "THe next N leap years are A, ..., X, Y, and Z."
	 * 
	 * @param count
	 */
	
	public void leapYears(int count) {
		
	}
	
	/**
	 * Is @number a palindromic number?
	 * 
	 * Print your solution in the following formats: "X is a palindromic number."
	 *                                               "X is not a palindromic number."
	 *                                               
	 * @param number
	 */
	
	public void palindromicNumbers(int number) {
		int b; 
			if (number == 0||number == 1 || number == 2 || number == 3 || number == 4 || number == 5 || number == 6 ||number == 7 || number == 8 || number == 9)
			{
				System.out.println(number + " is a palindromic number.");
			}
			else if (number % 2 == 0)
			{
				int sum = 0;
				sum = (number / 2) * (2) ;
				if (sum == number)
				{
					System.out.println("Is a paindromic number");
				}
			}
	
		
	}
	
	/**
	 * What is the @nth Fibonacci number, where @n is a positive integer?
	 * 
	 * Print your solution in the following formats: "The 21st Fibonacci number is X."
	 *                                               "The 22nd Fibonacci number is X."
	 *                                               "The 23rd Fibonacci number is X."
	 *                                               "The 24th Fibonacci number is X."
	 *                                               
	 * @param n
	 */
	
	public void fibonacci(int n) {
		int num = n % 10;
		int first = 0;
		int second = 1;
		int sum = 0;
		for (int x = 1; x < n; x++)
		{
			sum = first + second;
			first = second;
			second = sum;
		}
		if (num == 1)
		{
			System.out.println("The " + n + "st " + "Fibonacci number is " + sum);
		}
		else if (num == 2)
		{
			System.out.println("The " + n + "nd " + "Fibonacci number is " + sum);
		}
		else if (num == 3)
		{
			System.out.println("The " + n + "rd " + "Fibonacci number is " + sum);
		}
		else
		{
			System.out.println("The " + n + "th " + "Fibonacci number is " + sum +".");
		}

	}
	
	/**
	 * What is the sum of all multiples of @x and @y less than @limit, where @x, @y, and
	 * @limit are positive integers?
	 * 
	 * Print your solution in the following format: "The sum of all multiples of X and Y less than LIMIT is Z."
	 * 
	 * @param limit
	 */
	
	public void multiples(int x, int y, int limit) {
		
	}
}
