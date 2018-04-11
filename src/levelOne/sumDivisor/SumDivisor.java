package levelOne.sumDivisor;

public class SumDivisor {
  public int sumDivisor(int num) {
    int answer = 0;
    for (int i=1;i<=num;i++){
      if((num % i) ==0){
        answer += i;
      }
    }

    return answer;
  }
}
