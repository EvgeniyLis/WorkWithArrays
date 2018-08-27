package array.operations;

import java.util.Scanner;

public class FindMinMaxByPosition {
	
	//найти в массиве макс и мин эл-т и поменять их местами
	
	public static void outArray(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		double[] myArray;
		int number, posMin, posMax;
		double temp; // временная переменная для перестановки элементов массива местами
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		myArray=new double[number];
		System.out.println("Enter "+number+" of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextDouble();
		}
		System.out.println("Sourse array is ");
		outArray(myArray);//вызов метода вывода массива и передача ему в качестве параметра исходного массива 
		posMax=posMin=0;
		for (int i = 1; i < myArray.length; i++) {
			if (myArray[i]<myArray[posMin]) {
				posMin=i;
			}
			if (myArray[i]>myArray[posMax]) {
				posMax=i;
			}
		}
		temp=myArray[posMin];
		myArray[posMin]=myArray[posMax];
		myArray[posMax]=temp;
		System.out.println("Result array is :");
		outArray(myArray);
		input.close();
	}

}
