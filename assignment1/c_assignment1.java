
//Q3. Write a method called copyOf(), which accept an int array and returns a copy of the given array. 
//The method's signature is as follows:
//public static int[] copyOf(int[] array) 


package assignment1;

import java.util.Arrays;
import java.util.Scanner;

public class c_assignment1 {
	public static void main(String[] args){
		System.out.println("Enter Data in Array: ");
		int array1[] = new int[5];
		Scanner sc = new Scanner(System.in);
		
		for (int i=0;i<5;i++) {
			array1[i] = sc.nextInt();
		}
		
		int array2[] = Arrays.copyOf(array1,5);
		System.out.print(" Copy Data in Array2: ");	
		for (int i=0; i<5; i++) {
			System.out.print(array2[i]+" ");
		}		
	}
}
