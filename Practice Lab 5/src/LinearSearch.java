
public class LinearSearch {

	public static void main(String[] args) {
//		List to be searched from
		int[] myList = {1, 4, 7, 2, 9, 6, 2};
		
		System.out.print("Enter number to Search in DB: ");
		
//		Get user number to be searched
		int number = TextIO.getInt();
		
		System.out.println(Find.find(myList, number));
	}
}
