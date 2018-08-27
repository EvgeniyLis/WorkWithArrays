package array.operations;

import java.io.FileFilter;
import java.util.Scanner;

public class Example3 {
	
	//Посчитать количество отрицательных элементов

	public static void main(String[] args) {
		int[] sourceArray;
		int number, count=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		sourceArray=new int[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < sourceArray.length; i++) {
			sourceArray[i]=input.nextInt();
		}
		for (int i = 0; i < sourceArray.length; i++) {
			if (sourceArray[i]<0) {
				count++;
			}
		}
		System.out.println("Number of negative elements is "+count);
	}

}
