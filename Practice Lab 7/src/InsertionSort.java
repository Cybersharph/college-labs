
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] unsortedArray = {3, 1, 8, 6, 2};
		
		int[] storedSortedArray = Sort.sort(unsortedArray);
		
		for (int i = 0; i < storedSortedArray.length; i++) {
			System.out.print(storedSortedArray[i]);
		}

	}

}
