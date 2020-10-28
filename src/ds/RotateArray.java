package ds;

//O(n)
public class RotateArray {

	public static void main(String[] args) {
		RotateArray rotateArray = new RotateArray();
		int arr[] = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int rotateBy = 2;
		System.out.println("Original Array:");
		rotateArray.printArray(arr, 7);
		System.out.println("\n");
		rotateArray.rotateByLeft(arr, rotateBy, arr.length);
		rotateArray.printArray(arr, 7);
		System.out.println("\n");
		rotateArray.rotateByRight(arr, rotateBy, arr.length);
		rotateArray.printArray(arr, 7);
	}

	private void rotateByLeft(int[] arr, int rotateBy, int length) {
		for (int i = 0; i < rotateBy; i++) {
			rotateLeftByOne(arr, length);
		}

	}

	private void rotateByRight(int[] arr, int rotateBy, int length) {
		for (int i = 0; i < rotateBy; i++) {
			rotateRightByOne(arr, length);
		}

	}

	private void rotateRightByOne(int[] arr, int length) {
		int j, temp;
		temp = arr[length - 1];

		for (j = length - 1; j > 0; j--) {
			arr[j] = arr[j - 1];
		}
		arr[0] = temp;

	}

	private void rotateLeftByOne(int[] arr, int length) {
		int j, temp;
		temp = arr[0];
		for (j = 0; j < length - 1; j++) {
			arr[j] = arr[j + 1];
		}
		arr[j] = temp;

	}

	private void printArray(int arr[], int n) {
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] + " ");
	}
}
