package Test;

import java.util.Arrays;

public class Solution13 {
	// 제일 작은 수 제거하기
	/*
	 * 정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요. 단, 리턴하려는 배열이 빈
	 * 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고, [10]면
	 * [-1]을 리턴 합니다.
	 * 
	 */

	public static int[] solution(int[] arr) {
		/*
		 버블정렬이용
		int temp;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - i - 1; j++) {

				if (arr[j] > arr[j + 1]) {
					temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		*/
		if(arr.length <= 1) {
			int[] answer = {-1};
			return answer;
		}
		
		int[] answer = new int[arr.length-1];
		Arrays.sort(arr);
		System.out.println("반복문 위" + Arrays.toString(arr));
		for(int i = arr.length -1; i > 0 ; i--) {
			System.out.println(i);
			answer[arr.length-1-i] = arr[i];
		}
		
		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 4,3,2,1 };
		System.out.println(Arrays.toString(solution(arr)));
	}
}
