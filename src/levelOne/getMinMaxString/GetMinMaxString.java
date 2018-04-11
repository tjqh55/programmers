package levelOne.getMinMaxString;

import java.util.Arrays;

public class GetMinMaxString {
  public String getMinMaxString(String str) {
    String[] result;
    result = str.split(" ");
    int[] intResult = new int[result.length];

    for (int i = 0; i < result.length; i++) {
      intResult[i] = Integer.parseInt(result[i]);
    }
    Arrays.sort(intResult);
    String stringResult = String.valueOf(intResult[0]) + " " + String.valueOf(intResult[intResult.length-1]);
    return stringResult;
  }
}
