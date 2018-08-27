package array.operations;

import java.util.Scanner;

public class Example2 {
	
	//Посчитать сумму элементов массива

	public static void main(String[] args) {
		double[] firstArray;
		int number;
		double summa=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		firstArray=new double[number];
		System.out.println("Enter "+number+" elements of array" );
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i]=input.nextDouble();
		}
		for (int i = 0; i < firstArray.length; i++) {
			summa+=firstArray[i];
		}
		System.out.println("Summa of elemets of array is "+summa);

	}

}
