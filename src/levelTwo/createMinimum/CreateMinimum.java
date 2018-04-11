package levelTwo.createMinimum;

import java.util.ArrayList;
import java.util.Arrays;

public class CreateMinimum {

  public int getMinSum(int []A, int []B){
    int answer = 0;
    Arrays.sort(A);
    Arrays.sort(B);
    for(int i=0;i<A.length;i++){
      answer += A[i] * B[(B.length-i)-1];
    }

    return answer;
  }
}
