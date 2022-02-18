package basicprog;

import java.util.Scanner;

public class P3calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try (Scanner sc = new Scanner(System.in)) {
				System.out.println("Enter the First numbers:- ");
				double num1 = sc.nextDouble();
				
				System.out.println("Enter the Second numbers:- ");
				double num2 = sc.nextDouble();
	  
				System.out.println("Enter the operator (+,-,*,/)");
	  
				char op = sc.next().charAt(0);
	  
				double o = 0;
	  
				switch (op) {
	  
				// case to add 
				case '+':
	  
				    o = num1 + num2;
	  
				    break;
	  
				// case to subtract 
				case '-':
	  
				    o = num1 - num2;
	  
				    break;
	  
				// case to multiply 
				case '*':
	  
				    o = num1 * num2;
	  
				    break;
	  
				// case to divide 
				case '/':
	  
				    o = num1 / num2;
	  
				    break;
	  
				default:
	  
				    System.out.println("You enter wrong input");
	  
				    break;
				}
	  
				System.out.println("The final result:");
	  
				System.out.println();
	  
				// print the final result
				System.out.println(num1 + " " + op + " " + num2 + " = " + o);
			}

	}

}