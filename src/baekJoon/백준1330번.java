package baekJoon;

import java.util.Scanner;

public class 백준1330번 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("정수 A를 입력해라");
    int A = sc.nextInt();

    System.out.println("정수 B를 입력해라");
    int B = sc.nextInt();

    if (A > B) {
      System.out.println(">");
    } else if (A < B) {
      System.out.println("<");
    } else {
      System.out.println("==");
    }

  }
}
