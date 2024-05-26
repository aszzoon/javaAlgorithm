package dataStructure.배열과리스트;

import java.util.Scanner;

//N값 입력받기
//길이 N의 숫자를 입력, String형 변수 sNum에 저장
//int 형 변수 sum 선언하기
//for(cNUM 길이만큼 반복하기)
//{
// 배열의 각 자릿값을 정수형으로 변환하며 sum에 더하여 누적하기
//}
//sum 출력하기

public class 숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for (int i = 0; i < cNum.length; i++)
        {
            sum += cNum[i] - '0';
        }
        System.out.print(sum);
    }
}
