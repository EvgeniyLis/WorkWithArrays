package array.sort;

import java.util.Scanner;

public class ModifiedBoll {
	
	//���������� ���������� ���������������� ���������
	//������������, ����� ������ �������� ������������

	public static void outArray(double[] ar) {
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}
	public static void main(String[] args) {
		double[] myArray;
		double temp;
		int number;
		int border=0;//�����, �������� ������� �������� �������
		boolean isSorted;//�������� �������� �� ������� ������ ��������������
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
			isSorted=true; //������������, ��� ������ ������������
			for (int i = 0; i < myArray.length-1-border; i++) {
				if (myArray[i]>myArray[i+1]) {
					temp=myArray[i];
					myArray[i]=myArray[i+1];
					myArray[i+1]=temp;
					isSorted=false; //������������� �� ����������������� ������� ��������� �� ������
				}
			}
			border++;
		} while (!isSorted); //���� ����� �������� �� ��� ���, ���� ������ �� ������������
		System.out.println("Sorted array is : ");
		outArray(myArray);
		input.close();
	}
	

}
