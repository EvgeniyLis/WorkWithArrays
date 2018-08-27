package array.homework;

import java.util.Scanner;

public class Example5 {

	//посчитать сумму первой его половины и произведение второй
	public static void main(String[] args) {
		int[] myArray;
		int number, amount=0, multiplicity=1;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the size of array");
		number=input.nextInt();
		System.out.println("Enter "+number+" elements of array");
		myArray=new int[number];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]=input.nextInt();
		}
		for (int i = 0; i < (myArray.length/2); i++) {
			amount+=myArray[i];
		}
		for (int i = (myArray.length)/2; i < myArray.length; i++) {
			multiplicity*=myArray[i];
		}
		System.out.println("Amount of first half elements is "+amount+" and multiplicity of second half elements is "+multiplicity);
		input.close();
	}

}
