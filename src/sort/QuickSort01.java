package sort;

import java.util.Arrays;

public class QuickSort01
{
	private static void quickSort(int[] arr,int starIndex,int endIndex){
		if (starIndex < endIndex) {
			//�ҳ���׼
			int pivot = solve(arr, starIndex, endIndex);
			//�ֳ����ߵݹ����
			quickSort(arr, starIndex, pivot - 1);
			quickSort(arr, pivot + 1, endIndex);
		}
	}
	public static void main(String[] args)
	{
		//int arr[] = {4, 6, 8, 5, 9};
		//		int n=20;
		//		int[] arr = new int[n];
		//		for (int i = 0; i < n; i++) {
		//			arr[i] = (int) (Math.random() * n); // ����һ��[0, 8000000) ��
		//		}
		//		quickSort(arr,0,n-1) ;
		//		System.out.println("�����=" + Arrays.toString(arr));
		//		
		int[] a = {2, 4, 6, 1, 3, 7, 9, 8, 5};
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));

	}

	

	private static int solve(int[] arr, int starIndex, int endIndex){
		// TODO Auto-generated method stub
//		int pivot=arr[starIndex];
//		int left=starIndex;
//		int right=endIndex;
		
		int pivot = arr[starIndex];
		int left = starIndex;
		int right = endIndex;
		
		while(left!=right) {
			while (left < right && arr[right] > pivot) {
				right--;
			}
			while(left<right&&arr[left]<=pivot) {
				left++;
			}
			if(left<right) {
				swap(arr,left,right);
			}
		}
//		while (left != right) {
//			while (left < right && arr[right] > pivot) {
//				right--;
//			}
//			while (left < right && arr[left] <= pivot) {
//				left++;
//			}
//			//�ҵ�left�Ȼ�׼��right�Ȼ�׼С�����н���
//			if (left < right) {
//				swap(arr, left, right);
//			}
//		}
		
		swap(arr, starIndex, left);
		return left;
		
	}
	//��������
			public static void swap(int[] arr, int i, int j) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}

}
