package array.homework;

import java.util.Scanner;

public class Example4 {

	//кол-во эл-тов между мин и макс пределом, вводимым с консоли 
	public static void main(String[] args) {
		int[] myArray;
		int number, min, max, count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		System.out.println("Enter "+number+" elements of array");
		myArray=new int[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		System.out.println("Enter the minimum and the maximum");
		min=input.nextInt();
		max=input.nextInt();
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]>min && myArray[i]<max) {
				count++;
			}
		}
		System.out.println(count);
		input.close();
	}

}
