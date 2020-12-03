package Test;

import java.util.Arrays;

public class Solution07 {

	// 행렬의 덧셈
	/*
	 * 행렬의 덧셈은 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값을 서로 더한 결과가 됩니다. 2개의 행렬 arr1과 arr2를
	 * 입력받아, 행렬 덧셈의 결과를 반환하는 함수, solution을 완성해주세요.
	 */
	public static int[][] solution(int[][] arr1, int[][] arr2) {
		int[][] answer = new int[arr1.length][arr1[0].length];
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[0].length; j++) {
				answer[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		return answer;
	}

	public static void main(String[] args) {
		// 00 01 10 11

		// 00 10
		int[][] arr1 = { { 1, 2 }, { 2, 4 } };
		int[][] arr2 = { { 3, 6 }, { 4, 8 } };
		// 새롭게 안 사실 2차원배열은 deepToString을 쓴다!
		System.out.println(Arrays.deepToString(solution(arr1, arr2)));
	}
}
