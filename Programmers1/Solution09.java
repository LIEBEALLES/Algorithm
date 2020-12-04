package Test;

public class Solution09 {
//두 정수 사이의 합 
	/*
	 * 두 정수 a, b가 주어졌을 때 a와 b 사이에 속한 모든 정수의 합을 리턴하는 함수, solution을 완성하세요. 예를 들어 a =
	 * 3, b = 5인 경우, 3 + 4 + 5 = 12이므로 12를 리턴합니다.
	 */
	public static long solution(int a, int b) {
		long answer = 0;
		// a
		if (a > b) {
			for (int i = b; i < a + 1; i++) {
				answer += i;
			}
		} else if (a < b) {
			for (int i = a; i < b + 1; i++) {
				answer += i;
			}
		} else {
			answer = a;
		}
		return answer;
	}

//다른 사람의 풀이
//(b - a + 1) * (a + b) / 2;
	public static void main(String[] args) {
		int a = 5;
		int b = 5;
		System.out.println(solution(a, b));
	}
}
