package baekJoon;

import java.util.Scanner;

public class 백준10998번 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int A = sc.nextInt();
    int B = sc.nextInt();

    if(0< A && A <10 && 0 < B && B < 10){

      System.out.println( A * B);
    }
  }
}
