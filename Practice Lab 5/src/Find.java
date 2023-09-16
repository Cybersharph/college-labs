
public class Find {
	/**
	 * Liner Search Algorithm Implementation
	 * It iterates through a list to find the
	 * location of the value
	 * @param A array parameter expected from user
	 * @param N integer value expected from user
	 * @return index of value N
	 * @author Muyivu Shafiq
	 */
	public static String find(int[] A, int N) {
		for (int index = 0; index < A.length; index++) {
			if (N == A[index]) {
				return "Number is at index: " + Integer.toString(index);
			}
		}
		
		return "Number not found in the DB";
	}
}


