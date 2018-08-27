package arrays.declare;

public class Example1 {

	public static void main(String[] args) {
		int[] firstArray={3, 56, 75, -56};
		double secondArray[]={34.67, -986.67, 677.78, -8.78};
		boolean[] thirdArray;
		int n=5;
		thirdArray=new boolean[n];
		thirdArray[0]=true;
		thirdArray[1]=false;
		thirdArray[2]=5<10;
		thirdArray[3]=4!=5;
		thirdArray[4]=4>=4;
		System.out.println("First array: ");
		for (int i = 0; i < firstArray.length; i++) {
			System.out.println(firstArray[i]);
		}
		System.out.println("Second array: ");
		for (int i = 0; i < secondArray.length; i++) {
			System.out.print(secondArray[i]+" ");
		}
		System.out.println("Third array: ");
		for (int i = 0; i < thirdArray.length; i++) {
			System.out.print(thirdArray[i]+" ");
		}

	}

}
