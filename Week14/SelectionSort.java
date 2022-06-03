package Week14;




public class SelectionSort {

	void selectionSort(int[] a) {
		
		
		for(int i = 0; i < a.length-1;i++) {
			int min = i;
			for(int j = i+1;j< a.length;j++) {
				if(a[j] < a[min]) {
					min = j;
				}
			}
			int gecici = a[i];
			a[i] = a[min];
			a[min] = gecici;
		}
	}
	
	void toString(int[] a) {
		for(int i = 0; i < a.length;i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		int[] a = {14,3,12,7,15,21,58,56,24};
		
		SelectionSort ss = new SelectionSort();
		System.out.println("Unordered array : ");
		ss.toString(a);
		ss.selectionSort(a);
		System.out.println("Ordered array : ");
		ss.toString(a);

	}

}
