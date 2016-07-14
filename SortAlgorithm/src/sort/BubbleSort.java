package sort;

import org.junit.Test;

public class BubbleSort {
	
	public int[] bubbleSort(int[] A, int n) {
		while (n > 0) {
			for (int i = 0; i < (n - 1); i++) {
				if (A[i] > A[i + 1]) {
					int temp = A[i];
					A[i] = A[i + 1];
					A[i + 1] = temp;
				}
			}
			n--;
		}
		return A;
	}
	
	@Test
	public void Test() {
		int[] A = {1,2,3,5,2,3};
		int n = 6;
		int[] result = bubbleSort(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
