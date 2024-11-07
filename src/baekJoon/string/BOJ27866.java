package baekJoon.string;

import java.util.Scanner;

public class BOJ27866 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    String s= sc.next();
    int i = sc.nextInt();

    //charAt은 문자열 특정 위치에 있는 문자를 반환하는 메서드
    System.out.println(s.charAt(i - 1));

  }
}
