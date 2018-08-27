package array.remove.homevork;

import java.util.Scanner;

public class PositiveBeforeFirstPos {
	
	//найти кол-во положит. эл-тов и поставить его перед первым положительным эл-том
	
	public static void outArray(int[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.print(ar[i]+" ");
		}
	}

	public static void main(String[] args) {
		int[] sourseArray;
		int number, count=0, positionFirstPositive;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		sourseArray=new int[number];
		System.out.println("Enter "+number+" elements of array");
		for (int i = 0; i < sourseArray.length; i++) {
			sourseArray[i]=input.nextInt();
		}
		System.out.println("Sourse array is : ");
		outArray(sourseArray);
		for (int i = 0; i < sourseArray.length; i++) {
			if (sourseArray[i]>0) {
				count++;
			}
		}
		System.out.println();
		positionFirstPositive=0;
		for (int i = 0; i < sourseArray.length; i++) {
			if (sourseArray[i]>0) {
				positionFirstPositive=i;
				break;
			}
		}
		int[] newArray=new int[sourseArray.length+1];
		System.arraycopy(sourseArray, 0, newArray, 0, positionFirstPositive);
		newArray[positionFirstPositive]=count;
		System.arraycopy(sourseArray, positionFirstPositive, newArray, positionFirstPositive+1, sourseArray.length-positionFirstPositive);
		sourseArray=newArray;
		System.out.println(count);
		System.out.println("New array is : ");
		outArray(sourseArray);
		input.close();
	}

}
