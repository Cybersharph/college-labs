public class Find {
	/**
	 * method implementing the Search
	 * @param numbers array of numbers to be searched
	 * @param number an element to be search
	 * @return index of the number in an array
	 * @author Muyivu Shafiq
	 */
	public static int find(int[] numbers, int number) {
		
		int lowestIndex = 0;
		int highestIndex = numbers.length - 1;
		
		while(lowestIndex <= highestIndex) {
			int middleIndex = (lowestIndex + highestIndex) / 2;
			int middleNumber = numbers[middleIndex];
			
			if  (number == middleNumber) {
				return middleIndex;
			} else if (number < middleNumber){
				highestIndex = middleIndex - 1;
			} else {
				lowestIndex = middleIndex + 1;
			}
		}
		
		// in case no value
		return -1;
	}
}
