
public class Sort {
	/**
	 * method to sort an array [increasing order]
	 * this is an implementation of INSERTION SORT
	 * @param unsortedArray an array to be sorted
	 * @return a sorted array [increasing order]
	 * @author Muyivu Shafiq
	 */
	public static int[] sort(int[] unsortedArray) {
		//	3, 1, 8, 6, 2
		for (int i = 1; i < unsortedArray.length; i++) {
			
			int currentValueHolder = unsortedArray[i];
			int indexOfNumberBefore = i - 1;
			
			while(indexOfNumberBefore >= 0 && unsortedArray[indexOfNumberBefore]>currentValueHolder) {
				unsortedArray[indexOfNumberBefore + 1] = unsortedArray[indexOfNumberBefore];
				indexOfNumberBefore--;
			}
			
			unsortedArray[indexOfNumberBefore + 1] = currentValueHolder;
		}
		
		return unsortedArray;
	}
}
