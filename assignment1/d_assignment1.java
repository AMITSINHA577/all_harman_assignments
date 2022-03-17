
//Q4. Create pascal triangle using 2D arrary
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8


package assignment1;

import java.util.Scanner;

public class d_assignment1 {
	public static void main(String[] args){
		System.out.print("Enter the number of pascal triangle: ");
		Scanner sc = new Scanner(System.in);
		int pascalNumber = sc.nextInt(); 
		
		for (int i=1;  i<=pascalNumber+1; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
		}
	}

}
