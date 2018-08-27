package array.homework2;

import java.util.Scanner;

public class MinMaxChange {
	
	//поменять местами мин в первой половине и макс во второй
	
	public static void outArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
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
		posMin=0;
		for (int i = 0; i < myArray.length/2; i++) {
			if (myArray[i]<myArray[posMin]) {
				posMin=i;
			}
		}
		posMax=myArray.length/2;
		for (int i = myArray.length/2; i < myArray.length; i++) {
			if (myArray[i]>myArray[posMax]) {
				posMax=i;
			}
		}
		temp=myArray[posMin];
		myArray[posMin]=myArray[posMax];
		myArray[posMax]=temp;
		System.out.println();
		System.out.println("\nResult array is :");
		outArray(myArray);
		input.close();

	}

}
