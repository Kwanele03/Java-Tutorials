
public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Print numbers from 1 to 10 using a for loop.		
	
		for (int number = 1; number <= 10; number++) {
			System.out.println(number);
			}
			 System.out.println();
		   
		   
		// 2. Print a pattern of stars in a pyramid shape using nested loops..
			 
		int rows = 5;

                for (int i = 1; i <= rows; i++) {
              for (int j = 1; j <= rows - i; j++) {
               System.out.print(" ");
               }
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
               }
                System.out.println();
               }    
          System.out.println();
		   
		
		// 3. Print all even numbers between 1 and 20 using a for loop.

		   for (int i = 1; i <= 20; i++) {
				if (i % 2 == 0) {
					System.out.println(i);
					}
					     }
		
		   System.out.println();
		   
		
		// 4. Print all prime numbers between 1 and 50 using nested loops.		
		
	        for (int numbr = 2; numbr <= 50; numbr++) {
	        	
	      boolean isPrime = true;
	            
	         for (int i = 2; i <= Math.sqrt(numbr); i++) {
	            	
	             if (numbr % i == 0) {
	                 isPrime = false;
	                 break;
	                }
	            }
	            
	             if (isPrime) {
	                System.out.println(numbr);
	            }
	            
	        }

		   System.out.println();
		   
		   
		  // 5. Generate a Fibonacci sequence up to n terms using a for loop.	
		   
                  int n = 10, first = 0, second = 1;
		         
		        System.out.print("Fibonacci Series: " + first + ", " + second);
		           
		         for (int i = 2; i < n; i++) {
		             int next = first + second;
		               
		            System.out.print(",  " + next) ;
		               
		             first = second;
		             second = next;
		           }

	             }

            }
