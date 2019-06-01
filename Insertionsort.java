
public class Inseration {
	
	public int[] insertionSorting(int[] a) {
		int temp;
		for(int i=1; i< a.length; i++) {
			for(int j= i ; j>0; j--) {
				if(a[j]<a[j-1]) {
					temp = a[j-1];
					a[j-1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	public int[] bubblesort(int[] a) {
		int temp;
		for(int i=0; i<a.length;i++) {
			
		}
		return a;
	}
	
	public static void main(String args[]) {
		int[] arr = new int[] {4,3,1,2,0};
		Inseration i = new Inseration();
		int[] copy;
		copy = i.insertionSorting(arr);
		for(int k=0; k<copy.length; k++) {
			System.out.println(copy[k]);
		}
	}

}
