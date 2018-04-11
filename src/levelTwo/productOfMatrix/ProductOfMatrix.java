package levelTwo.productOfMatrix;

public class ProductOfMatrix {
  public int[][] productMatrix(int[][] A, int[][] B) {
    int[][] answer = new int[A.length][B.length];

    for (int i = 0; i < answer.length; i++) {
      for (int j = 0; j < A.length; j++) {
        for (int k = 0; k < B.length; k++) {
          answer[i][j] += (A[i][k] * B[k][j]);
        }
      }
    }

    for(int i=0;i<answer.length;i++){
      for(int j=0;j<A.length;j++){
        System.out.println(answer[i][j]);
      }
    }

    return answer;
  }
}
