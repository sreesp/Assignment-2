import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		
		//Finding arr2 is subarray of arr1
		
		int a[] = { 1, 2, 3, 4, 51, 1, 1, 11, 1, 6, 3, 7, 8 };
		int[] b = { 3, 1, 1, 8, 6 };

		
		boolean flag = true;
		for (int i = 0; i < b.length; i++) {
			
			int j;
			
			for (j = 0; j < a.length; j++) {
				if (b[i] == a[j]) {
					//System.out.println(i + "  " + j);
					break;
				}
			}
			//System.out.println(j);
			if (j == a.length) {
				flag = false;
				//System.out.println(i + "  " + j);
			}
		}

		if (flag) {
			System.out.println("yes");
		}
		else 
			System.out.println("No");

	}
}
