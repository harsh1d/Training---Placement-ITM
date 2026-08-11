// find first and last occurrence by implementing binary search on array

package day7.task5;

public class task5 {
	private static int firstOccurrence(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1; // stores the valid index mid

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				right = mid - 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}

	private static int lastOccurrence(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;
		int result = -1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr[mid] == target) {
				result = mid;
				left = mid + 1;
			} else if (arr[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 2, 2, 3, 4, 5};
		int target = 2;

		System.out.println("First occurrence: " + firstOccurrence(arr, target));
		System.out.println("Last occurrence: " + lastOccurrence(arr, target));
	}
}
