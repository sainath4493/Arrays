package ds;

import java.util.HashMap;
import java.util.Map;

//O(n)
public class FindPairWithGivenSumInArrayHashing {
	public static void main(String[] args) {
		int[] arr = new int[] { 8, 7, 2, 5, 3, 1 };
		int sum = 10;

		findPair(arr, sum);
	}

	private static void findPair(int[] arr, int sum) {
		Map<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(sum - arr[i])) {
				System.out.println("Pair [" + (sum - arr[i]) + "," + arr[i] + "] found at index "
						+ map.get(sum - arr[i]) + " and " + i);
				// return;
			}
			map.put(arr[i], i);
		}
		// System.out.println("Pair not found");
	}
}
