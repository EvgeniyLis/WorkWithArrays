package arrays.adremove.elements;

import java.util.Scanner;

public class FunctionAddElements {
	
	//��� ������, ��������� ����� ��� ��-��� � �������� �� �� ���� ���������� ��-��

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
		int[] newArray=new int[myArray.length+1]; //�������� ������ �������, ���-�� ��������� �������� �� ���� ������ ��� � ������
		System.arraycopy(myArray, 0, newArray, 0, myArray.length); //����������� ������ ������ � �����
		newArray[newArray.length-1]=summa; //���������� ���������� �������� �������� �����
		myArray=newArray; 
		System.out.println();
		System.out.print("New array is : ");
		outArray(myArray);
		input.close();
	}

}
