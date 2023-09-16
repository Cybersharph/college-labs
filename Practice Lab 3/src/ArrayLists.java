import java.util.ArrayList;
import java.util.Arrays;

public class ArrayLists {

	public static void main(String[] args) {
//		Create an ArrayList 'myFriends' and assign | add some items
		ArrayList<String> myFriends = new ArrayList<>(Arrays.asList("Fik", "Shar","Ras"));
		
		for (int i = 0; i < myFriends.size(); i++) {
//			Iterate through the list and print all the items
			System.out.println(myFriends.get(i));
		};
	}
	/**
	 * Important thing I have noted so far about ArrayLists:
	 * 1. They have different methods from those of Arrays
	 * 2. One example is .size() to get the length but not length
	 * 3. Another example is .get(index) to get a value at a particular index
	 * 4. For premitive data types line int, boolean, char e.t.c, we can use Wrappers e.g Integer, Boolean, Character, etc.
	 * 5. Wrappers are the objects representation of premitive data types
	 */
}
