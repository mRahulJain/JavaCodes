package L11;

public class Quick_Sort {

	public static void main(String[] args) {
		int[] arr = { 10, 92, 36, 47, 65, 12, 23, 89 };
		quickSort(arr, 0, arr.length - 1);
		for (int val : arr) {
			System.out.println(val);
		}

	}

	public static void quickSort(int[] arr, int lo, int hi) {
		if (lo > hi) {
			return;
		}

		int left = lo;
		int right = hi;
		int mid = (lo + hi) / 2;
		int pivot = arr[mid];

		while (left <= right) {
			while (arr[left] < pivot) {
				left++;
			}

			while (arr[right] > pivot) {
				right--;
			}

			if (left <= right) {
				int temp = arr[left];
				arr[left] = arr[right];
				arr[right] = temp;
				left++;
				right--;
			}
		}

		quickSort(arr, lo, right);
		quickSort(arr, left, hi);
	}

}
