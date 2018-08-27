package array.homework;

import java.util.Scanner;

public class Example3 {
	
	// посчитать среднее арифметическое эл-тов

	public static void main(String[] args) {
		int[] myArray;
		int number, amount=0, average;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		System.out.println("Enter "+number+" elements of array");
		myArray=new int[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			amount+=myArray[i];
		}
		average=amount/myArray.length;
		System.out.println(average);
		input.close();
	}

}
