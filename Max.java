import java.io.*;
import java.util.Scanner;

class Max {
	
	public static void main(String args[]){
	
		Scanner sc = new Scanner(System.in);
		int x, y, z, largest = 0;
		
		System.out.println("Enter the values for : ");
		System.out.print("X = ");
		x = sc.nextInt();
		System.out.print("Y = ");
		y = sc.nextInt();
		System.out.print("Z = ");
		z = sc.nextInt();
		
		largest = x;
		
		if (y > largest)
			largest = y;
		
		if (z > largest)
			largest = z;
		
		System.out.println("The Largest is " + largest);
		
		
	}

}