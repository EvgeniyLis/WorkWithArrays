package arrays.adremove.elements;

import java.util.Scanner;

public class MultiplyAddToHalf {
	
	//посчитать произведение эл-тов массива и вставить его в середину массива
	
	public static void outArray(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
		}

	public static void main(String[] args) {
		double[] myArray;
		int count, multiply=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		count=input.nextInt();
		myArray=new double[count];
		System.out.println("Enter "+count+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextDouble();
		}
		for (int i = 0; i < myArray.length; i++) {
			multiply*=myArray[i];
		} 
		System.out.println(multiply);
		double[] newArray=new double[myArray.length+1];
		System.arraycopy(myArray, 0, newArray, 0, myArray.length/2);
		newArray[myArray.length/2]=multiply;
		System.arraycopy(myArray, myArray.length/2, newArray, myArray.length/2+1, myArray.length-myArray.length/2);
		myArray=newArray;
		System.out.println();
		System.out.println("Final array is : ");
		outArray(myArray);
		input.close();
	}

}
