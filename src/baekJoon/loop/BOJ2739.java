package baekJoon.loop;

import java.util.Scanner;

//구구단
public class BOJ2739 {
 public static void main(String[] args) {
  //키보드 입력 함수
  Scanner sc = new Scanner(System.in);
  //키보드 정수 입력
  int n = sc.nextInt();
  System.out.println("입력한 구구단 단수" + n);

  for (int i = 1; i < 10; i++) {
  System.out.println(n*i);
  }
 }
}