package array.homework;

import java.util.Scanner;

public class Example6 {

	// найти минимум первой половины и максимум во второй
	public static void main(String[] args) {
		double[] myArray;
		int number;
		double min,max;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		System.out.println("Enter "+number+" elements of array");
		myArray=new double[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextDouble();
		}
		min=myArray[0];
		max=myArray[myArray.length/2];
		for (int i = 0; i < myArray.length/2; i++) {
			if (myArray[i]<min) {
				min=myArray[i];
			}
		}
		for (int i = myArray.length/2; i < myArray.length; i++) {
			if (myArray[i]>max) {
				max=myArray[i];			
			}
		}
		input.close();
		System.out.println("Minimum of first half of array is "+min+" and maximum of second half is "+max);
	}

}
