package sort;

import java.util.Arrays;

public class QuickSort03
{

	public static void main(String[] args)
	{
		int n=20;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * n); // ����һ��[0, 8000000) ��
		}
		quickSort(arr,0,n-1) ;
		System.out.println("�����=" + Arrays.toString(arr));

	}

	private static void quickSort(int[] arr, int startIndex, int endIndex)
	{
		if(startIndex<endIndex) {
			int pivot=solve(arr,startIndex, endIndex);
			quickSort(arr,startIndex,pivot-1);
			quickSort(arr,pivot+1,endIndex);
		}
		
	}

	private static int solve(int[] arr, int startIndex, int endIndex)
	{
		int pivot=arr[startIndex];
		int left=startIndex;
		int right=endIndex;
		while(left<right) {
			while(left<right&&arr[right]>=pivot) {
				right--;
			}
			while(left<right&&arr[left]<pivot) {
				left++;
			}
			if(left<right) {
				swap(arr,left,right);
			}
		}
		swap(arr,startIndex,left);
		return left;
		
	}

	private static void swap(int[] arr, int left, int right)
	{
		int temp=arr[left];
		arr[left]=arr[right];
		arr[right]=temp;
		
	}

}
