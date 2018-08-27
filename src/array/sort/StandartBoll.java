package array.sort;

import java.util.Scanner;

public class StandartBoll {
	
	//дан числовой массив произвести его сортировку стандартным пузырьком

	public static void outArray(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	
	public static void main(String[] args) {
		double[] myArray;
		int number;
		double temp;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		myArray=new double[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextDouble();
		}
		System.out.println("Sourse array is : ");
		outArray(myArray);
		for (int border = 0; border < myArray.length-1; border++) { //цикл, управляющий границей перебираемых в массиве элементов
			for (int i = 0; i < myArray.length-1-border; i++) {
				if (myArray[i]>myArray[i+1]) {
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
