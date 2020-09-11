package sort;

import java.util.Arrays;

public class Mergesort
{

	
	//��д�鲢������ϰ 2020/4/21 xgy
	public static void main(String[] args)
	{
		int n=20;
		int[] arr = new int[n];
		int[] temp= new int[arr.length];
		for (int i = 0; i < n; i++) {
			arr[i] = (int) (Math.random() * n); // ����һ��[0, 8000000) ��
		}
		Mergesort(arr,0,n-1,temp) ;
		System.out.println("�����=" + Arrays.toString(arr));


	}

	private static void Mergesort(int[] arr, int left, int right, int[] temp)
	{
		// TODO Auto-generated method stub
		if(left<right) {
			int mid=(left+right)/2;
			Mergesort(arr,left,mid,temp);
			Mergesort(arr,mid+1,right,temp);
			
			merge(arr,left,mid,right,temp);
		}
		
	}

	private static void merge(int[] arr, int left, int mid, int right, int[] temp)
	{
		int i=left;
		int j=mid+1;
		int index=left;
		while(i<=mid&&j<=right) {
			temp[index]=arr[i]<arr[j]? arr[i++]:arr[j++];
			index++;
		}
		while(i<=mid) {
			temp[index]=arr[i++];
			index++;
		}
		while(j<=right) {
			temp[index]=arr[j++];
			index++;
		}
		for(int t=left;t<=right;t++) {
			arr[t]=temp[t];
		}
		
		
	}

}
