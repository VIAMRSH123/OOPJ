import java.io.*;
import java.util.Scanner;

class Factorial {
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num, fact = 1;
		
		System.out.print("Enter the value : ");
		num = sc.nextInt();
		
		if (num == 0)
			System.out.print("The factorial of 0 is 1");

		if (num < 0)
			System.out.print("The factorial of 0 is 1");
		
		for(int i = 1; i <= num; i++){
			fact = fact * i;
		} 

		System.out.print("The factorial is " + fact);
	}
}