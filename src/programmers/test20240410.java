package programmers;

public class test20240410 {
    public int solution(int[] array, int height) {
        int answer = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > height) {
                answer++;
            }
        }
        return answer;
    }
}
/*
난 허접이니 차례대로 분석 해보자.

test20240110 클래스 안에 public int solution 메서드가 있다.
int 타입의 메서드 이며, 매개변수는 int[] 타입의 array와, int 타입의 height를 받는다.
리턴값을 받기위해 int 타입의 answer 변수를 0으로 초기화를 하고,
이제 매개변수를 통해 받은 정수를 제어문으로 처리해보자.

배열을 통해서 여러개의 정수가 들어올테니 하나하나 체크하면서
height와 비교를 해야한다.

for을 통해 정수 index를 초기화 하고, 인덱스를 배열의 길이 보다 작을때 실행,
작을때 까지 실행되는 중간에 if문을 통해 배열 값이 height 보다 크면 for문 마지막 조건이 실행된다.

answer는 첫째줄에서 0으로 초기화 하였으므로,
if문 조건에 해당되는 값들을 for문으로 체크한 값이 0에서
증감연산자 ++로 더해지게 되어

return answer;에 머쓱이보다 키 큰 사람 수가 return 된다.
 */