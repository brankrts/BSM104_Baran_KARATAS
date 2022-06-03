package Week14;



public class MergeSort {

	void sort(int a[],int left,int right) {
		if(left < right) {
			int mid = left + (right - left)/2;
			
			sort(a,left,mid);
			sort(a,mid+1,right);
			
			merge(a,left,mid,right);
		}
	}
	
	void merge(int[] a,int left,int mid,int right) {
		
		int number1 = mid - left  + 1;
		int number2 = right-mid;
		
		int[] Left = new int[number1];
		int[] Right = new int[number2];
		
		for(int i = 0;i < number1; i++) {
			Left[i] = a[left + i];
		}
		for(int i = 0; i < number2; i++) {
			Right[i] = a[mid + 1 + i];
		}
		
		int i = 0 , j = 0;
		int k = left;
		
		while(i < number1 && j < number2) {
			if(Left[i] < Right[j]) {
				a[k] = Left[i];
				i++;
			}
			else {
				a[k] = Right[j];
				j++;
			}
			k++;
		}
		
		// Kalan elemanlarý kopyalamak için
		while(i < number1) {
			a[k] = Left[i];
			i++;
			k++;
		}
		while(j < number2) {
			a[k] = Right[j];
			j++;
			k++;
		}
	}
	
	void toString(int[] a) {
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] a = {14,12,7,15,21,58,56,24};
		
		MergeSort ms = new MergeSort();
		System.out.println("Unordered array : ");
		ms.toString(a);
		ms.sort(a, 0, a.length-1);
		System.out.println("Ordered array : ");
		ms.toString(a);
	}

}
