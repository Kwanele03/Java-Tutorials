
public class swicth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	// 1. Print the day of the week based on a number using a switch statement.
		
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            case 3: System.out.println("Wednesday"); break;
            case 4: System.out.println("Thursday"); break;
            case 5: System.out.println("Friday"); break;
            case 6: System.out.println("Saturday"); break;
            case 7: System.out.println("Sunday"); break;
            default: System.out.println("Invalid day number");
        }
        
        
       // 2. Use a switch statement to perform a calculator operation (+, -, * , /).
         
        int a = 20, b = 5;
        char operator = '*';
        switch (operator) {
            case '+': System.out.println(a + b); break;
            case '-': System.out.println(a - b); break;
            case '*': System.out.println(a * b); break;
            case '/': System.out.println(a / b); break;
            default: System.out.println("Invalid operator.");
        }
        
    }

}
