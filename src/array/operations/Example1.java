package array.operations;

import java.util.Scanner;

public class Example1 {
	
	//���� ������� (������������)

	public static void main(String[] args) {
		int[] firstArray;
		int number;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter size of array");
		number=input.nextInt();
		firstArray=new int[number];//�������� ������ ��� ������ (number ����� ���������)
		System.out.println("Enter "+number+" elements of array" );
		for (int i = 0; i < firstArray.length; i++) {
			firstArray[i]=input.nextInt();
		}
		System.out.println("Our array is: ");
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
	}

}
