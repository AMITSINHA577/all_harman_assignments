//Q1. Write a program called Fibonacci to display the first 20 Fibonacci numbers F(n), where F(n)=F(n–1)+F(n–2) and F(1)=F(2)=1. Also compute their average. The output shall look like:
//
//The first 20 Fibonacci numbers are:
//1 1 2 3 5 8 13 21 34 55 89 144 233 377 610 987 1597 2584 4181 6765
//The average is 885.5


package assignment1;

import java.util.Scanner;

public class a_assignment {
	public static void main(String[] args) {
		int term, firstnumber=-1,secondnumber=1,fibnumber=0; 
		double sum=0,average;
		System.out.print("Enter term: ");
		Scanner r = new Scanner(System.in);
		term = r.nextInt();
		
		for(int i=1;i<=term;i++) {
			fibnumber=firstnumber+secondnumber;
			firstnumber=secondnumber;
			secondnumber=fibnumber;
			System.out.print(fibnumber+" ");
			sum = sum+fibnumber;
		}
		
		System.out.println("sum of all number is:"+sum);
		average = (sum / term);         
        System.out.println("Average : "+average);
		
	}

}
