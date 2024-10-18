import java.io.*;
import java.util.Scanner;

class Max {
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int num, flag = 1;
		
		System.out.print("Enter the value : ");
		num = sc.nextInt();
		
		for(int i = 2; i < num; i++){
			if ( num % i == 0) {
				flag = 0;
				break;
			}
		} 
		
		if (flag == 0)
			System.out.print(num + " is not a Prime number");
		else
			System.out.print(num + " is a Prime number");
	}
}