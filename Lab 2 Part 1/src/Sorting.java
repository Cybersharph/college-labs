import java.util.*;

public class Sorting {
    
	public static final int ARRAY_SIZE = 7;
    
    public static void main(String[] args) {
        int[] firstArray = new int[ARRAY_SIZE];
        int[] secondArray = new int[ARRAY_SIZE];
        
        Random random = new Random();
        
        // Let's fill both arrays with identical random numbers
        for (int i = 0; i < ARRAY_SIZE; i++) {
            int randomNumber = (int) (Integer.MAX_VALUE * random.nextDouble());
            firstArray[i] = randomNumber;
            secondArray[i] = randomNumber;
        }
        
        // Let's now sort the first Array and measure time
        long startTime = System.currentTimeMillis();
        sort(firstArray);
        long endTime = System.currentTimeMillis();
        System.out.println("\nSorting took: " + (endTime - startTime) + " ms");
        
        // Let's print array contents
        System.out.println("\nElements in the first Array:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print(firstArray[i] + " ");
        }
        
        // Let's now sort the second Array and measure time
        long startTime2 = System.currentTimeMillis();
        Arrays.sort(secondArray);
        long endTime2 = System.currentTimeMillis();
        System.out.println("\n\nSorting took: " + (endTime2 - startTime2) + " ms");
        
        // Let's print array contents
        System.out.println("\nElements in the second Array:");
        for (int i = 0; i < ARRAY_SIZE; i++) {
            System.out.print(secondArray[i] + " ");
        }
    }
    
    /**
	 * method to sort an array [increasing order]
	 * this is an implementation of INSERTION SORT
	 * @param unsortedArray an array to be sorted
	 * @return a sorted array [increasing order]
	 * @author Muyivu Shafiq
	 */
	public static int[] sort(int[] unsortedArray) {
		
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
