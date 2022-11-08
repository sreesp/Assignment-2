import java.util.Arrays;

public class Launch2 {

	public static void main(String[] args) {
		
		//Findings duplicates of an Array

		int[] a = { 1, 1, 44, 54, 33, 44, 2, 3, 4, 1, 2, 5, 5, 4, 6, 3, 5};
		int[] b = new int[a.length];
		int index = 0;

		System.out.print("Duplicate elements of Array 'a' are: ");

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					boolean flag = false;
					for (int k = 0; k < b.length; k++) {
						if (a[i] == b[k]) {
							flag = true;
							break;
						}
					}
					if (flag == false) {
						System.out.print(a[i] + " ");
						b[index] = a[i];
						index++;
					}
				}
			}
		}

	}

}
