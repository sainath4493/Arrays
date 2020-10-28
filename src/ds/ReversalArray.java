package ds;

//O(n)
public class ReversalArray {
	public static void main(String[] args) {

		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		printArray(arr);
		rotate(arr, d);
		printArray(arr);
	}

	private static void printArray(int arr[]) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");

		System.out.println("\n");
	}

	private static void rotate(int[] arr, int d) {
		if (d == 0)
			return;

		int n = arr.length;

		d = d % n;
		reverse(arr, 0, d - 1);
		printArray(arr);
		reverse(arr, d, n - 1);
		printArray(arr);
		reverse(arr, 0, n - 1);
	}

	private static void reverse(int[] arr, int start, int end) {
		int temp;
		while (start < end) {
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
	}
}
