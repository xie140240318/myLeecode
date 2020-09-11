package sort;

import java.util.Arrays;

public class QuicksortZhihu
{
	public static void quickSort(int[] arr, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			//�ҳ���׼
			int pivot = solve(arr, startIndex, endIndex);
			//�ֳ����ߵݹ����
			quickSort(arr, startIndex, pivot - 1);
			quickSort(arr, pivot + 1, endIndex);
		}
	}

	//�һ�׼
	private static int solve(int[] arr, int startIndex, int endIndex) {
		int pivot = arr[startIndex];
		int left = startIndex;
		int right = endIndex;
		while (left != right) {
			while (left < right && arr[right] > pivot) {
				right--;
			}
			while (left < right && arr[left] <= pivot) {
				left++;
			}
			//�ҵ�left�Ȼ�׼��right�Ȼ�׼С�����н���
			if (left < right) {
				swap(arr, left, right);
			}
		}
		//��һ����ɣ���left��right�غϵ�λ�úͻ�׼���������ػ�׼��λ��
		swap(arr, startIndex, left);
		return left;
	}

	//��������
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] a = {2, 4, 6, 1, 3, 7, 9, 8, 5,2};
		quickSort(a, 0, a.length - 1);
		System.out.println(Arrays.toString(a));
	}
}
