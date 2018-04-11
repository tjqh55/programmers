package levelOne.divisible;

import java.lang.Integer;
import java.util.ArrayList;

public class Divisible {
  public int[] divisible(int[] array, int divisor) {
    ArrayList<Integer> divArray = new ArrayList<Integer>();

    for (int i : array) {
      if (i % divisor == 0) {
        divArray.add(i);
      }
    }

    int[] ret = new int[divArray.size()];
    for (int i = 0; i < ret.length; i++) {
      ret[i] = divArray.get(i).intValue();
    }

    return ret;
  }
}
