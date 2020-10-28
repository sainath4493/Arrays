package ds;

import java.util.Arrays;

//O(n) 
public class CyclicallyRotate {
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5 };
		System.out.println(Arrays.toString(arr));

		rotate(arr);

		System.out.println(Arrays.toString(arr));
	}

	private static void rotate(int arr[]) {

		int temp = arr[arr.length - 1];

		for (int i = arr.length - 1; i > 0; i--) {
			arr[i] = arr[i - 1];
		}
		arr[0] = temp;
	}
}
