//Q5. Write a program to find next date 
//Input :  enter day: 31
// 	 enter month: 12
//	enter year : 2022
//	today date: 31/12/2022
//	Next date: 1/1/2023
//   


package assignment1;

import java.util.Scanner;

public class e_assignment1 {
	public static void main (String[] args) {
		int day, month, year;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter day: ");
		day = sc.nextInt();
		
		System.out.print("Enter month: ");
		month = sc.nextInt();		
		
		System.out.print("Enter year: ");
		year = sc.nextInt();
		
		System.out.println("Current date: "+ day +"/"+ month+"/"+ year);
		
		int numberOfDAyInMonth[] = {-1, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeapYear(year)) {
			numberOfDAyInMonth[2] = 29;
		}
		
		day = day+1;
		if(day > numberOfDAyInMonth[month]) {
			day = 1;
			month ++;
			if(month > 12) {
				month = 1;
				year ++;
			}
		}
		System.out.println("Next date: "+ day +"/"+ month+"/"+ year);
	}
	public static boolean isLeapYear (int year) {
		if((year % 400 == 0 || year % 100 != 0)&& (year % 4 == 0)) {
			return true;
		}
		else 
			return false;
		
	}

}
