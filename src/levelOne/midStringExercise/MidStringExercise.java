package levelOne.midStringExercise;

public class MidStringExercise {
  String getMiddle(String word){
    int length = word.length();
    int position = length/2;
    if(length % 2 == 0) {
      word = word.substring(position-1, position+1);
    } else {
      word = word.substring(position, position+1);
    }
    return word;
  }
}
