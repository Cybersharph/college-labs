import java.util.Arrays;

public class CopyArrayItems {
	

	public static void main(String[] args) {
		int[] list = {3, 2, 1, 2};
		
		int[] newList = Arrays.copyOf(list, 3);
		
		for (int i = 0; i < newList.length; i++) {
			System.out.print(newList[i]);
		}
	}
}
