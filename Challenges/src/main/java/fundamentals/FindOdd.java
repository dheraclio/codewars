package fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

/**
 * Given an array, find the int that appears an odd number of times.
 *
 * There will always be only one integer that appears an odd number of times.
 *
 * //TODO Find faster solution
 * @author dheraclio@gmail.com
 */
public class FindOdd {

  /**
   *
   * O(n*n) solution
   * @param A array of int to search
   * @return the odd number
   * @throws RuntimeException case od int not found
   */
  public static int findIt(int[] A) {
    //Uses a map to count int occurrences
    HashMap<Integer, Integer> map = new HashMap<>(A.length);
    for (int i = 0; i < A.length; i++)
      map.put(A[i], map.get(A[i]) != null ? map.get(A[i]) + 1 : 1);

    //find the first number which was found odd time
    for (Map.Entry<Integer, Integer> entry : map.entrySet())
      if (entry.getValue() % 2 != 0) return entry.getKey();

    throw new RuntimeException("Odd int not found");
  }
}
