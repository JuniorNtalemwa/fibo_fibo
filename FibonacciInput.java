import java.util.Scanner;

public class FibonacciInput {
	public static void main(String args[]) {
		Scanner number_input = new Scanner (System.in);
		
		int n1;
		System.out.print("Enter first number: ");
		n1 = number_input.nextInt();
		
		int n2;
		System.out.print("Enter second number: ");
		n2 = number_input.nextInt();
		int count;
		System.out.print("Enter the series number: ");
		count = number_input.nextInt();
		
		System.out.println(n1 + "\n" + n2);
		
		int n3,i;
		
		
		
		for (i=2;i<count;i++){
			n3 = n1 + n2;
			System.out.println(n3);
			n1 = n2;
			n2 = n3;
		}
							
	}
}