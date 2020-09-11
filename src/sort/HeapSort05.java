package sort;

import java.util.Arrays;

public class HeapSort05
{

	public static void main(String[] args)
	{
		int n=20;
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * n); // ����һ��[0, 8000000) ��
		}
		heapSort(arr) ;
		System.out.println("�����=" + Arrays.toString(arr));
	}

	private static void heapSort(int[] arr)
	{
		int len=arr.length;
		for(int i=len/2-1;i>=0;i--) {
			adjust(arr,i,len);
		}
		int temp;
		for(int i=len-1;i>0;i--) {
			temp=arr[i];
			arr[i]=arr[0];
			arr[0]=temp;
			adjust(arr,0,i);
		}
		
	}

	private static void adjust(int[] arr, int i, int len)
	{
		int temp =arr[i];
		for(int k=2*i+1;k<len;k=2*k+1) {
			if(k+1<len&&arr[k+1]>arr[k]) {
				k++;
			}
			if(arr[k]>temp) {
				arr[i]=arr[k];
				i=k;
			}else
				break;
		}
		arr[i]=temp;
		
	}

}
