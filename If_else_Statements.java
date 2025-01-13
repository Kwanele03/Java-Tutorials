
public class If_else_Statements {

	public static void main(String[] args) {
	
		
	// 1.	Write a program to check if a number is even or odd using an if statement.
		
		int Number = 25;
		
		if (Number % 2 == 0) {
		System.out.println("Even");
		} 
		
		else {
		System.out.println("Odd");
		}
		
		
	// 2.	Find the largest of three numbers using nested if-else.
		
        int num1 = 10, num2 = 20, num3 = 15;
        
        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("Largest is: " + num1);
            } 
            else {
                System.out.println("Largest is: " + num3);
            }
            
        }
        
        else {
            if (num2 > num3) {
                System.out.println("Largest is: " + num2);
            } 
            else {
                System.out.println("Largest is: " + num3);
            }
        }

		
	// 3.  Check if a number is positive, negative, or zero using if-else.
        
        int num = -5;
        if (num > 0) {
            System.out.println("Positive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        
        // 4.   Check if a year is a leap year or not.

                int year = 2024;
                
                if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
                	
                    System.out.println(year + " is a leap year.");                   
                } 
                else {
                    System.out.println(year + " is not a leap year.");
                }     

	}

}
