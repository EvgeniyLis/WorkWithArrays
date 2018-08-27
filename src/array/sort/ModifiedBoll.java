package array.sort;

import java.util.Scanner;

public class ModifiedBoll {
	
	//произвести сортировку модифицированным пузырьком
	//используется, когда массив частично отсортирован

	public static void outArray(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		double[] myArray;
		double temp;
		int number;
		int border=0;//перем, меняющая границу перебора массива
		boolean isSorted;//проверяе является ли текущий массив отсортированым
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		myArray=new double[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextDouble();
		}
		System.out.println("Sourse array is :");
		outArray(myArray);
		do {
			isSorted=true; //предполагает, что массив отсортирован
			for (int i = 0; i < myArray.length-1-border; i++) {
				if (myArray[i]>myArray[i+1]) {
					temp=myArray[i];
					myArray[i]=myArray[i+1];
					myArray[i+1]=temp;
					isSorted=false; //предположение об отсортированнисти массива оказалось не верным
				}
			}
			border++;
		} while (!isSorted); //цикл будет работать до тех пор, пока массив не отсортирован
		System.out.println("Sorted array is : ");
		outArray(myArray);
		input.close();
	}
	

}
