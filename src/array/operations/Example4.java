package array.operations;

import java.util.DuplicateFormatFlagsException;
import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Example4 {
	
	//Поиск минимального и максимального элемента массива

	public static void main(String[] args) {
		double[] sourceArray;
		int number;
		double min, max;
		//double minMulti=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		sourceArray=new double[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < sourceArray.length; i++) {
			sourceArray[i]=input.nextDouble();
		}
		min=max=sourceArray[0];
		for (int i = 1; i < sourceArray.length; i++) {
			if (sourceArray[i]<min) {
				min=sourceArray[i];
			}
			if (sourceArray[i]>max) {
				max=sourceArray[i];
			}
		}
		//minMulti=min*3;
		System.out.println("Minimum element of array is "+min+" and maximum elememt is "+max);
		//System.out.println(minMulti);
	}

}
