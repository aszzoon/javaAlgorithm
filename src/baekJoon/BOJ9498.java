package baekJoon;

import java.util.Scanner;

public class BOJ9498 {
  private static String a;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int score = sc.nextInt();

    String a = (90 <= score && score <= 100) ? "A" :
               (80 <= score && score <= 89) ? "B" :
               (70 <= score && score <= 79) ? "C" :
                (60 <= score && score <= 69) ? "D" : "F";

    System.out.println(a);
    }
  }

