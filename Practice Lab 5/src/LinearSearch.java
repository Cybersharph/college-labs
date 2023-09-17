
public class LinearSearch {

	public static void main(String[] args) {
		
		int[] myList = {1, 4, 7, 2, 9, 6, 2};
		System.out.print("Enter number to Search in DB: ");
		
		int number = TextIO.getInt();
		System.out.println(Find.find(myList, number));
	}
}