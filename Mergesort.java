public class Mergesort {
	
	public int[] mergesplit(int[] a) {
		int[] leftarray;
		int[] rightarray;
		if(a.length == 1) {
			return a;
		}	
		int[] left = new int[a.length/2];
		int[]right = new int[a.length - (a.length/2)];
		System.arraycopy(a, 0, left, 0, a.length/2);
		System.arraycopy(a, (a.length/2), right, 0, (a.length - (a.length/2)));
		leftarray = mergesplit(left);
		rightarray = mergesplit(right);
			
		int[] sortedarray = merge(leftarray, rightarray);
		return sortedarray;
	}
	
	public int[] merge(int[] left, int[] right) {
		int[] sorted = new int[left.length + right.length];
		int i=0, j=0, k=0;
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				sorted[k] = left[i];
				i++;
				k++;
			}
			else {
				sorted[k] = right[j];
				j++;
				k++;
			}
		}
		while(i < left.length) {
			sorted[k] = left[i];
			k++;
			i++;
		}
		while(j < right.length) {
			sorted[k] = right[j];
			k++;
			j++;
		}
		return sorted;
	}
	
	public static void main(String args[]) {
		int[] arr = new int[] {4,3,1,2,0,5};
		Mergesort i = new Mergesort();
		int[] copy;
		copy = i.mergesplit(arr);
		for(int k=0; k<copy.length; k++) {
			System.out.println(copy[k]);
		}
	}

}
