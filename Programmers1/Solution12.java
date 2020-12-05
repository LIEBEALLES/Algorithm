package Test;

import java.util.Arrays;

public class Solution12 {
	// 소수찾기
	/*
	 * 1부터 입력받은 숫자 n 사이에 있는 소수의 개수를 반환하는 함수, solution을 만들어 보세요. 소수는 1과 자기 자신으로만
	 * 나누어지는 수를 의미합니다. (1은 소수가 아닙니다.)
	 * 
	 */

	// 내 방법
	// 시간초과 실패 .........
	public static int solution(int n) {
		int answer = 0;
		int cnt = 0; // 약수의 갯수

		// 2~n개 약수를 구하고
		// 2개일 때 구하자!

		// i= 2345
		// j= 12 123 1234 12345
		for (int i = 2; i <= n; i++) {
			cnt = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) {
					cnt++;
				}
			}
			if (cnt == 2) {
				answer++;
				System.out.println("i" + i);
			}
		}
		return answer;
	}

	// 다른 사람의 풀이
	// boolean 어렵다 잘 활용해야할텐데
	public static int solution1(int n) {
		int answer = 0;
		boolean[] checked = new boolean[n + 1];

		System.out.println(Arrays.toString(checked));

		// i= 2345
		for (int i = 2; i <= n; i++) {
			// true라면
			if (!checked[i]) {
				answer++;
			}
			// j 2345 345 45
			for (int j = i + i; j <= n; j += i) {
				// j+=i 배수제거
				if (!checked[j])
					checked[j] = true;
			}
		}
		System.out.println(Arrays.toString(checked));
		return answer;
	}

	// 현모풀이
	//sqrt = 제곱근
	public static int solution2(int n) {
		int answer = 0;
		int[] arr = new int[n + 1];
		for (int a = 2; a <= n; a++) {
			arr[a] = a;
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (arr[i] == 0)
				continue;
			for (int j = i + i; j <= n; j += i) {
				arr[j] = 0;
			}
		}
		for (int i = 2; i <= n; i++) {
			if (arr[i] != 0) {
				answer++;
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		// System.out.println(solution(5));
		System.out.println(solution1(5));
		// System.out.println(solution2(5));
	}
}
