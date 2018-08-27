package array.remove.homevork;

import java.util.Scanner;

public class NegativeAfterFirstNeg {
	
	//найти кол-во отрицат. эл-тов и вставить его после первого отриц.
	
	public static void outArray(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[] args) {
		double[] sourseArray;
		int number, count=0, posFirstNegative;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		sourseArray=new double[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < sourseArray.length; i++) {
			sourseArray[i]=input.nextDouble();
		}
		for (int i = 0; i < sourseArray.length; i++) {
			if (sourseArray[i]<0) {
				count++;
			}
		}
		System.out.println();
		posFirstNegative=0;
		for (int i = 0; i < sourseArray.length; i++) {
			if (sourseArray[i]<0) {
				posFirstNegative=i;
				break;
			}
		}
		double[] newArray=new double[sourseArray.length+1];
		System.arraycopy(sourseArray, 0, newArray, 0, posFirstNegative+1);
		newArray[posFirstNegative+1]=count;
		System.arraycopy(sourseArray, posFirstNegative+1, newArray, posFirstNegative+2, sourseArray.length-posFirstNegative-1);
		sourseArray=newArray;
		System.out.println(count);
		System.out.println("New array is :");
		outArray(sourseArray);
		input.close();
		
	}

}
