package array.homework2;

import java.util.Scanner;

public class MinAmongPositive {
	
	//минимум среди положительных элементов
	
	public static void outArray(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray[i]);
		}
	}

	public static void main(String[] args) {
		int[] myArray;
		int count, posMin=-1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		count=input.nextInt();
		myArray=new int[count];
		System.out.println("Enter "+count+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]>0) {
				posMin=i;
				break;
			}
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]>0 && myArray[i]<myArray[posMin]) {
				posMin=i;
			}
		}
		if (posMin==-1) {
			System.out.println("There is not positive elements");
		}else {
		System.out.println("Minimum among positive elements is : "+myArray[posMin]);
		}
		input.close();
	}
	
}
