import java.util.InputMismatchException;
import java.util.Scanner;
//RuntimeException
public class first {
public static void main(String[] args) {
	//1.try is a keyword.
	//2.occurring the exception code we can write inside try block.
	//3.try block can never use alone.
	//4.try block can use with catch block or finally block.
	//5.try can also use with catch and finally.
	//6.we can also use nested try catch block.
	//7.we can use single try with multiple catch block.
	
	//catch is a keyword.
	//catch is used to handle an exception.

	
	//finally is a keyword.
	//finally block is used to closing your connection.
	//finally block execute either exception are occurred or not.
	
	Scanner scanner=new Scanner(System.in);
	
	try {
		System.out.println("enter first number");
		int i=scanner.nextInt();
		System.out.println("enter second number");
		int j=scanner.nextInt();
		int k=i/j;
		System.out.println("Your output is : "+k);
	}catch (ArithmeticException e) {
		System.out.println("please dont div a number by 0.");
	}catch (InputMismatchException e) {
		System.out.println("please enter number only");
	}
}
}
