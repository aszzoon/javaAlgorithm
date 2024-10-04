package baekJoon;

/*
연도가 주어졌을때, 윤년이면 1, 아니면 0을 출력
윤년: 연도가 4의 배수 또는 100의 배수가 아닐때 또는 400의 배수
ex) 2012년 은 4의 배수, 100의 배수는 아니기때문에 윤년
ex) 1900년은 100의 배수 400의 배수는 아니기 떄문에 윤년이 아님
하지만 2000년은 400의 배수이기 때문에 윤년

입력 : 첫째 줄에 연도가 주어지고 연도는 1보다 크거나 같고 4000보다 작거나 같은 자연수
출력 : 첛째줄에 윤년이면1, 아니면 0을 출력
*/

import java.util.Scanner;

public class BOJ2753 {
  public static void main(String[] args) {
    // 연도 입력
    Scanner sc = new Scanner(System.in);
    int year = sc.nextInt();
    if(year % 4 ==0 && year %100!=0 || year%400==0){
      System.out.println("1");
    }
    else {
      System.out.println("0");
    }

  }
}


