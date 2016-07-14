package sort;

import org.junit.Test;

/**
 * 归并排序算法, 复杂度O(nlogn)
 * @author lewang
 *
 */
public class MergeSort {
	
	public int[] mergeSort(int[] A, int n) {
		return sort(A, 0, n - 1);
	}
	
	public int[] sort(int[] A, int l, int r) {
		int mid = (l + r) / 2;
		if (l < r) {
			sort(A, l, mid);
			sort(A, mid + 1, r);
			merge(A, l, mid, r);
		}
		return A;
	}
	
	public void merge(int[] A, int l, int mid, int r) {
		int[] temp = new int[r - l + 1];
		int i = l; // 左指针
		int j = mid + 1; // 右指针
		int k = 0;
		
		// 左右组最小数放入临时数组
		while (i <= mid && j <= r) {
			if (A[i] < A[j]) {
				temp[k++] = A[i++];
			} else {
				temp[k++] = A[j++];
			}
		}
		
		// 把左右剩余的值放入临时数组
		while (i <= mid) {
			temp[k++] = A[i++];
		}
		
		// 把右边剩余值放入临时数组
		while (j <= r) {
			temp[k++] = A[j++];
		}
		
		for(int x = 0; x < temp.length; x++) {
			A[x + l] = temp[x];
		}
	}
	
	@Test
	public void Test() {
		int[] A = {1,2,3,5,2,3};
		int n = 6;
		int[] result = mergeSort(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
