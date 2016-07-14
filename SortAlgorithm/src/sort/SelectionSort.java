package sort;

public class SelectionSort {
	
	public int[] selectionSort(int[] A, int n) {
		int min = 0;
		int t = 0;
		int index = 0;
		while (t < n - 1) {
			min = A[t];
			index = t;
			for (int i = t; i < n; i++) {
				if (min > A[i]) {
					min = A[i];
					index = i;
				}
			}
			A[index] = A[t];
			A[t] = min;
			t++;
		}
		return A;
	}
	
	@org.junit.Test
	public void Test() {
		int[] A = {10,9,8,7,6,5,4,3,2,1};
		int n = 10;
		int[] result = selectionSort(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
