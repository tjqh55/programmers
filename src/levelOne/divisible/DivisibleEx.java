package levelOne.divisible;
import java.util.Arrays;

public class DivisibleEx {


  // 아래는 테스트로 출력해 보기 위한 코드입니다.
  public static void main(String[] args) {
    Divisible div = new Divisible();
    int[] array = {5, 9, 7, 10};
    System.out.println( Arrays.toString( div.divisible(array, 5) ));
  }
}
