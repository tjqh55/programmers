package levelTwo.productOfMatrix;

public class ProductOfMatrixEx {
    public static void main(String[] args) {
    ProductOfMatrix c = new ProductOfMatrix();
    int[][] a = { { 1, 2 }, { 2, 3 } };
    int[][] b = { { 3, 4 }, { 5, 6 } };
    // 아래는 테스트로 출력해 보기 위한 코드입니다.
    System.out.println("행렬의 곱셈 : " + c.productMatrix(a, b));
  }
}
