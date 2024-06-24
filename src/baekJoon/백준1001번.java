package baekJoon;
// 제출시엔 패키지 이름 포함 안함

import java.util.Scanner;

public class 백준1001번 {
  // 제출시엔 클래스 이름 Main
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (0 < A && A < 10 && 0 < B && B < 10) {
      System.out.println(A - B);
    }
  }
}
