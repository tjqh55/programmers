package levelOne.evenOrOdd;

public class EvenOrOdd {
  String evenOrOdd(int num) {
    if(num % 2 == 0){
      String result = "Even";
      return result;
    }
    else{
      String result = "Odd";
      return result;
    }
  }
}
