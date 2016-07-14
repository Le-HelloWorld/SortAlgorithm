package sort;

/**
 * 快速排序算法, 复杂度O(nlogn)
 * 思路,选出基数,划分左半区,右半区,依次递归,最后得到排序好的数组
 * @author lewang
 *
 */

public class QuickSort {
	
	public int[] quickSort(int[] A, int n) {
		
		return sort(A, 0, n - 1);
	}
	
	public int[] sort(int[] A, int left, int right) {
		if (left < right) {
			int p = partition(A, left, right);
			sort(A, left, p - 1);
			sort(A, p + 1, right);
		}
		return A;
	}
	
	/*
	 * 使用两个指针,一个在最左端,一个在最右端
	 * 先从右往左,找到比基数小的值,然后暂停循环
	 * 再从左往右,找到比基数大的值,然后暂停循环
	 * 交换数值,继续循环
	 * 直到2个指针碰面,然后该位置的值和基数互换,分组完毕
	 */
	public int partition(int[] A, int l, int r) {
		int temp = A[l]; // 存放基数
		int i = l; // 最左边的指针
		int j = r; // 最右边的指针
		int t = 0;
		
		
		while (i != j) {
			// 从右往左
			while (A[j] >= temp && i < j) {
				j--;
			}
			
			// 从左往右
			while (A[i] <= temp && i < j) {
				i++;
			}
			
			// 两个指针未相遇
			if (i < j) {
				t = A[i];
				A[i] = A[j];
				A[j] = t;
			}
		}
		// 基数归位
		A[l] = A[i];
		A[i] = temp;
		return i;
	}
	
	@org.junit.Test
	public void test() {
		int[] A = {6, 1, 2, 7, 9, 3, 4, 5, 10, 8};
		int n = 10;
		int[] result = quickSort(A, n);
		for (int i = 0; i < n; i++) {
			System.out.print(result[i] + " ");
		}
	}

}
