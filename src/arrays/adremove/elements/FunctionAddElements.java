package arrays.adremove.elements;

import java.util.Scanner;

public class FunctionAddElements {
	
	//дан массив, посчитать сумму его эл-тов и добавить ее вв виде последнего эл-та

	public static void outArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}
	
	public static void main(String[] args) {
		int[] myArray;
		int number, summa=0;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		myArray=new int[number];
		System.out.println("Enter "+" elements of array");
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		for (int i = 0; i < myArray.length; i++) {
			summa+=myArray[i];
		}
		int[] newArray=new int[myArray.length+1]; //создание нового массива, кол-во элементов которого на один больше чем в ствром
		System.arraycopy(myArray, 0, newArray, 0, myArray.length); //скопировали старый массив в новый
		newArray[newArray.length-1]=summa; //присвоение последнему элементу значения суммы
		myArray=newArray; 
		System.out.println();
		System.out.print("New array is : ");
		outArray(myArray);
		input.close();
	}

}
