package array.homework;

import java.util.Scanner;

public class Example2 {

	//посчитать сумму положительных элементов и произведение отрицательных
	
	public static void main(String[] args) {
		double[] myArray;
		int number;
		double amountPos=0, multiNeg=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the number of array");
		number=input.nextInt();
		myArray=new double[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextDouble();
		}
		for (int i = 0; i < myArray.length; i++) {
			if (myArray[i]>0) {
				amountPos+=myArray[i];
			}
			else {
				multiNeg*=myArray[i];
			}
		}
		System.out.println("Amount of positive elements is "+amountPos+" and multiplicity of negative elements is "+multiNeg);
		input.close();
	}
	

}
