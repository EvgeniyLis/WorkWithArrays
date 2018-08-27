package array.homework;

import java.util.Scanner;

public class Example1 {

	// Посчитать кол-во четных  нечетных эл-тов массива
	public static void main(String[] args) {
		int[] myArray;
		int number, countEven=0, countOdd=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		myArray=new int[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]%2==0) {
				countEven++;
			}else {
				countOdd++;
			}
		}
		System.out.println("The amount of even elements are "+countEven+" and of odd elements are "+countOdd);
		input.close();
	}

}
