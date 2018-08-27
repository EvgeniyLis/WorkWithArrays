package array.homework2;

import java.util.Scanner;

public class MinMultiMaxDividng {
	
	// минимал. эт- массива удвоить, макс. уменьшить на треть
	
	public static void outArray(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] myArray;
		int count, posMin, posMax, temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		count=input.nextInt();
		myArray=new int[count];
		System.out.println("Enter "+count+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		System.out.println("Sourse array is :");
		outArray(myArray);
		posMin=posMax=0;
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]<myArray[posMin]) {
				posMin=i;
			}
			if (myArray[i]>myArray[posMax]) {
				posMax=i;
			}
		}
		myArray[posMin]*=2;
		myArray[posMax]/=3;
		temp=myArray[posMin];
		myArray[posMin]=myArray[posMax];
		myArray[posMax]=temp;
		System.out.println("Result array is :");
		outArray(myArray);
		input.close();
	}

}
