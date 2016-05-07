package fundamentals;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.function.Function;

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
   * @param array of int to search
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

/*
  //Best solution found on Codewars to me
  public static int findIt(int[] A) {
    int xor = 0;
    //Since the problem stats that there will always be a single odd int, the XOR works.
    for (int i : A) {
      xor ^= i;
    }
    return xor;
  }
*/
/*
//Java 8 solution, slow but ok
public static int findIt(int[] a) {
    return Arrays.stream(a)
                 .boxed()
                 .collect(Collectors.groupingBy(Function.identity()))
                 .entrySet()
                 .stream()
                 .filter(e -> e.getValue().size() % 2 == 1)
                 .mapToInt(e -> e.getKey())
                 .findFirst()
                 .getAsInt();
    }
*/
/*
//Clever but too expensive
  public static int findIt(int[] A) {
    final TreeSet<Integer> set = new TreeSet<>();
    for (int x : A) {
      if (set.contains(x)) {
        set.remove(x);
      } else {
        set.add(x);
      }
    }
    return set.first();
  }
  */
}
