package basic;

//키보드 입력 관련 자바 기본 메서드
import java.util.Scanner;

public class 키보드입력 {
	public static void main(String[] args) {

		//
		Scanner stdInt = new Scanner(System.in);

		System.out.println("키보드 입력해라");

		int a = stdInt.nextInt();

		System.out.println(a);

	}

}
