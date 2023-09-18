
public class InsertionSort {

	public static void main(String[] args) {
		
		int[] unsortedArray = {3, 1, 8, 6, 2};
		
		int[] sortedArray = Sort.sort(unsortedArray);
		
		for (int i = 0; i < sortedArray.length; i++) {
			System.out.print(sortedArray[i]);
		}

	}

}
