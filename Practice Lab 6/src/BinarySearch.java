
public class BinarySearch {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 4, 5, 6, 7};
		System.out.print("Enter number to Search in DB: ");
		int number = TextIO.getInt();
		System.out.println(Find.find(numbers, number));
		
	}
}
