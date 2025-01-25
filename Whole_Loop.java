   import java.util.Scanner;

public class Whole_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. 	Calculate the sum of numbers from 1 to n using a while loop.
		int n = 10;
		int sum = 0;
		
		int i = 1;
		while (i <= n) {
		sum += i;
		i++;
		}
		System.out.println("Sum is: " + sum);
		 

		
		// 2. Count the number of digits in a number using a while loop.
	       int number = 12345;
	       int count = 0;
	      
	         while (number > 0) {
	             number /= 10;
	             count++;
	         }
	         
	         System.out.println("Number of digits: " + count);
	
		// 3. Find the greatest common divisor (GCD) of two numbers using a while loop. 
		         
		  int a = 36, b = 60;
		  
                  while (a != b) {
                  if (a > b) {
                  a = a - b;
                } 
                else {
                  b = b - a;
               }
            } 
           System.out.println("GCD is: " + a);
	
	// 4. Calculate the sum of the digits of a number using a while loop.	               
	 int num = 12345;
         int calculateSum = 0;
         
         while (num > 0) {
        	 calculateSum += num % 10;
             num /= 10;
         }
         System.out.println("Sum of digits: " + calculateSum);

		
	// 5. Simulate a basic login system using a while loop.
	     
          String correctUsername = "user";
          String correctPassword = "pass";
          
          Scanner scanner = new Scanner(System.in);

          while (true) {
              System.out.print("Enter username: ");
              String username = scanner.nextLine();
              System.out.print("Enter password: ");
              String password = scanner.nextLine();

              if (username.equals(correctUsername) && password.equals(correctPassword)) {
                  System.out.println("Login successful!");
                  break;
              } 
              else {
                  System.out.println("Incorrect username or password. Try again.");
              }
          }                                 
     }

}
