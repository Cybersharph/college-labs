
import java.util.Arrays;

public class CopyArrayItems {
  
  public static void main(String[] args) {
    
    int[] list = {1, 2, 3};
    
    /** 
     * Copy "list" Array to "newList Array
     * Has same length as original  Array
     */
    
    int[] newList = Arrays.copyOf(list, list.length);
    
//    Arrays.fill(newList, 0); // Fill an array with a single value;
    
    for (int i = 0; i < newList.length; i++) {
      System.out.print(newList[i]);
    }
    
    System.out.println("");
    
//    Binary search | list must be sorted.
    int three = Arrays.binarySearch(newList, 1);
    System.out.println(three);
  }
}

import java.util.Arrays;

public class CopyArrayItems {
  
  public static void main(String[] args) {
    
    int[] list = {1, 2, 3};
    
    /** 
     * Copy "list" Array to "newList Array
     * Has same length as original  Array
     */
    
    int[] newList = Arrays.copyOf(list, list.length);
    
//    Arrays.fill(newList, 0); // Fill an array with a single value;
    
    for (int i = 0; i < newList.length; i++) {
      System.out.print(newList[i]);
    }
    
    System.out.println("");
    
//    Binary search | list must be sorted. 123
    int three = Arrays.binarySearch(newList, 1);
    System.out.println(three);
  }
}
