
public class SelectionSortArray {

	public static void main(String[] args) {

		int[] arr = { 111111, 111111, 33, 33, };

		for (int i = 0; i < arr.length - 1; i++) {

			int minIndex = i;
			int temp;

			for (int j = i + 1; j < arr.length; j++) {

				if (arr[j] < arr[minIndex]) {
					minIndex = j;
				}
			}

			temp = arr[i];
			arr[i] = arr[minIndex];
			arr[minIndex] = temp;

		}

		for (int element : arr) {
			System.out.print(element + " ");
		}

	}

}
