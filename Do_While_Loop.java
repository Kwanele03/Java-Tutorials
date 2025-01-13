import java.util.Scanner;

public class Do_While_Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// 1. Find the factorial of a number using a do-while loop.
		
		
		int num = 6;
		int factorial = 1;
		int i = 1;
		
		
		do {
		factorial *= i;
		i++;
		}
		while (i <= num);
		System.out.println("Factorial is: " + factorial);
		
		
		
		// 2. Create a simple menu-driven program using a do-while loop.
		
		Scanner scanner = new Scanner(System.in);
		int choice;

		do {
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Exit");
		System.out.print("Enter your choice: ");
		choice = scanner.nextInt();

		if (choice >= 1 && choice <= 3) {
		System.out.println("Enter two numbers: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		switch (choice) {
		case 1 -> System.out.println("Sum: " + (a + b));
		case 2 -> System.out.println("Difference: " + (a - b));
		case 3 -> System.out.println("Product: " + (a * b));
		}
		}
		} while (choice != 4);

		System.out.println("Program exited.");



	}

}
