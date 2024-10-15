package baekJoon;

import java.util.Scanner;

public class BOJ14681 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();

    int quadrant = 0;

    if (A > 0 && B > 0) {
      quadrant = 1;
    } else if (A < 0 && B > 0) {
      quadrant = 2;
    } else if (A < 0 && B < 0) {
      quadrant = 3;
    } else if (A > 0 && B < 0) {
      quadrant = 4;
    }

    System.out.println(quadrant);
  }
}

