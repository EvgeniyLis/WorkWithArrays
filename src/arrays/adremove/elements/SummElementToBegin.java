package arrays.adremove.elements;

import java.util.Scanner;

public class SummElementToBegin {
	
	//найти количество отрицательных элементов и записать это число в начало массива

	public static void outArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String[] args) {
	int[] myArray;
	int number, count=0;
	Scanner input=new Scanner(System.in);
	System.out.println("Enter size of array");
	number=input.nextInt();
	myArray=new int[number];
	System.out.println("Enter "+" elements of array");
	for (int i = 0; i < myArray.length; i++) {
		myArray[i]=input.nextInt();
	}
	for (int i = 0; i < myArray.length; i++) {
		if (myArray[i]<0) {
			count++;
		}
	}
	int[] newArray=new int[myArray.length+1];
	System.arraycopy(myArray, 0, newArray, 1, myArray.length);
	newArray[0]=count;
	myArray=newArray;
	System.out.println();
	System.out.println("New array is :");
	outArray(myArray);
	input.close();
	}

}
