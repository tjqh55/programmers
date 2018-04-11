package levelOne.fibonacci;

public class Fibonacci {
  public long fibonacci(int num) {
    if (num <= 1){
      return num;
    }
    else {
      return fibonacci(num-2) + fibonacci(num-1);
    }
  }
}
