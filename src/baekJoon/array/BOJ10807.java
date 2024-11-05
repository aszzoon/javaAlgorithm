package baekJoon.array;

import java.util.Scanner;

public class BOJ10807 {
  public static void main(String[] args) {
    //키보드 입력
    Scanner sc = new Scanner(System.in);
    // 배열의 크기
    int N = sc.nextInt();
    int[] numbers = new int[N];

    for (int i = 0; i < N; i++) {
      numbers[i] = sc.nextInt();
    }
  }
}
