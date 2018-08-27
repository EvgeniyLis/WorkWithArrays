package array.homework2;

import java.util.Scanner;

public class SortByHalf {
	
	//сортировка первой половины массива по возрастанию, второй по убыванию

	public static void outArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		int[] myArray;
		int number;
		int temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		myArray=new int[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		System.out.println("Sourse array is : ");
		outArray(myArray);
		for (int border = 0; border < myArray.length/2-1; border++) { 
			for (int i = 0; i < myArray.length/2-1-border; i++) {
				if (myArray[i]>myArray[i+1]) {
					temp=myArray[i];
					myArray[i]=myArray[i+1];
					myArray[i+1]=temp;
				}
			}
		}
		for (int border = 0; border < myArray.length/2-1; border++) { 
			for (int i = myArray.length/2; i < myArray.length-1-border; i++) {
				if (myArray[i]<myArray[i+1]) {
					temp=myArray[i];
					myArray[i]=myArray[i+1];
					myArray[i+1]=temp;
				}
			}
		}
		System.out.println("Result array is :");
		outArray(myArray);
		input.close();
	}

}
