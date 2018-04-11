package levelOne.reverseStr;

import java.util.Arrays;

public class ReverseStr {
  public String reverseStr(String str){
    char[] charArray = new char[str.length()];
    for(int i=0; i<str.length(); i++) {
      charArray[i] = str.charAt(i);
    }

    Arrays.sort(charArray);
    String reverseResult = "";
    for(int i=charArray.length-1; i>=0; i--) {
      reverseResult += Character.toString(charArray[i]);
    }

    return reverseResult;
  }
}
