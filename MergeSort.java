public class MergeSort{
	public static void merge(int[] a, int start, int mid, int end){
		
		int leftLength = mid - start + 1;
		int rightLength = end - mid;

		int[] L = new int[leftLength];
		int[] R = new int[rightLength];

		for(int i=0; i<leftLength; i++){
			L[i] = a[start + i];
		}

		for(int j=0; j<rightLength; j++){
			R[j] = a[mid + 1 + j];
		}

		System.out.println("un" + start + " " + mid + "  " + end);
		printArray(a);
		printArray(L);
		printArray(R);

		int i = 0, j = 0;
		int k = start;

		while(i < leftLength && j < rightLength){
			if(L[i] <= R[j]){
				a[k] = L[i];
				i++;
			}
			else{
				a[k] = R[j];
				j++;
			}
			k++;
		}

		while(i < leftLength){
		 	a[k] = L[i];
			i++;
			k++;
		}
		
		while(j < rightLength){
			a[k] = R[j];
			j++;
			k++;
		}

		System.out.println("Sorted");
		printArray(a);

	}	

	public static void sort(int[] a, int start, int end){
		if(start < end){
			int mid = (start + end) / 2;
			System.out.println("----"+start+" "+mid+" "+end);
			sort(a, start, mid);
			sort(a, mid+1, end);
			merge(a, start, mid, end);
		}
	}

	public static void printArray(int[] arr){
		for(int x : arr){
			System.out.print(x + " ");
		}
		System.out.println();
	}

	public static void main(String[] args){
		int[] arr={76,3,1,98};
		printArray(arr);
		sort(arr, 0, arr.length-1);
		printArray(arr);
	}			
}