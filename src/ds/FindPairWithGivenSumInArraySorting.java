package ds;

import java.util.Arrays;

//O(nlog(n))
public class FindPairWithGivenSumInArraySorting {

	public static void main(String[] args) {
		int[] arr = new int[] { 8, 7, 2, 5, 3, 1 };
		int sum = 5;
		findPair(arr, sum);
	}

	private static void findPair(int[] arr, int sum) {

		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int low = 0;
		int high = arr.length - 1;

		while (low < high) {
			if (arr[low] + arr[high] == sum) {
				System.out.println("Pair Found : [" + arr[low] + "," + arr[high] + "]");
				return;
			}

			if (arr[low] + arr[high] < sum) {
				low++;
			} else {
				high--;
			}
		}
		System.out.println("Pair not found.");
	}
}
