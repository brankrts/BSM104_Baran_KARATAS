package Week14;


public class BubbleSort {

	void bubbleSort(int[] a) {
		
		for(int i = 0 ; i < a.length -1 ; i++) {
			for(int j = 0;j < a.length - i - 1 ;j++) {
				if(a[j] > a[j+1]) {
					int gecici = a[j];
					a[j] = a[j+1];
					a[j+1] = gecici;
				}
			}
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
		
		BubbleSort bs = new BubbleSort();
		System.out.println("Unordered array : ");
		bs.toString(a);
		bs.bubbleSort(a);
		System.out.println("Ordered array : ");
		bs.toString(a);
	}

}
