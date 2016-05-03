import java.util.Scanner;

public class NumberSort {

	public static void main(String[] args) {
		System.out.print("Enter total numbers: ");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println("List out the "+num+" numbers.");
		int[] number = new int[num];
		for (int i = 0; i < num; i++) {
			int next = scan.nextInt();
			number[i] = next;
		}
		sortNumber(number);
		System.out.print("Sorted array is: ");
		for(int i=0;i<number.length;i++){
			System.out.print(number[i]+", ");
		}
	}

	static void sortNumber(int[] arr) {
		int i, j;
		int temp;
		for (i = 0; i < arr.length - 1; i++) {
			for (j = i+1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}
			}
		}
	}

}
