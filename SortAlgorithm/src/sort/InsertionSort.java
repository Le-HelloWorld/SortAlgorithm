package sort;

import org.junit.Test;

public class InsertionSort {
	
	public int[] insertionSort(int[] A, int n) {
		int j = 1;
		int i = 0;
		int key = 0;
		
		while (j < n) {
			key = A[j];
			i = j - 1;
			
			while (i >= 0 && A[i] > key) {
				A[i + 1] = A[i];
				i = i - 1;
			}
			A[i + 1] = key;
			j++;
		}
		
		return A;
	}
	
	@Test
	public void Test() {
		int[] A = {1,2,3,5,2,3};
		int n = 6;
		int[] result = insertionSort(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
