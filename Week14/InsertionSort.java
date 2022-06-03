package Week14;


public class InsertionSort {
	
	void insertionSort(int[] a) {
		for(int i = 1;i< a.length;i++) {
			int baslangic = a[i];
			int j = i -1 ;
			while(j >= 0 && a[j] > baslangic) {
				a[j+1] = a[j];
				j--;
			}
			a[j+1] = baslangic;
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
		
		InsertionSort is = new InsertionSort();
		System.out.println("Unordered array : ");
		is.toString(a);
		is.insertionSort(a);
		System.out.println("Ordered array : ");
		is.toString(a);
	}

}

