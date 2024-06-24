package baekJoon;
// 제출시엔 패키지 이름 포함 안함

import java.util.Scanner;

public class 백준1000번 {
// 제출시엔 클래스 이름 min
  public static void main(String[] args) {

    System.out.println("두 정수를 하나씩 입력하면 합이 나온다.");
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    if (0 < A && A < 10) {
      A = A;
    }

    if (0 < B && B < 10) {
      B = B;
    }

    System.out.println(A + B);
  }
}
