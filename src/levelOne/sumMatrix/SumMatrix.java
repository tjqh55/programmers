package levelOne.sumMatrix;

public class SumMatrix {
  int[][] sumMatrix(int[][] A, int[][] B) {
    int[][] answer = {{0, 0}, {0, 0}};

    for (int i=0;i<A.length;i++){
      for( int j=0;j<B.length;j++){
        answer[i][j] = A[i][j] + B[i][j];
      }
    }

    return answer;
  }
}
