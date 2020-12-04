package Test;

import java.util.Arrays;

public class Solution06 {
	// k번째수

	public static int[] solution(int[] array, int[][] commands) {
		
		int[] answer = new int[commands.length];
		
		int i = 0;
		int j = 0;
		int k = 0;
		
		for(int num = 0; num < answer.length; num++  ) {
			i = commands[num][0];
			j = commands[num][1];
			k = commands[num][2];
			
			int[] arr = Arrays.copyOfRange(array,i-1, j);
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));
			int newnum = arr[k-1];
			answer[num] = newnum;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] array = { 1, 5, 2, 6, 3, 7, 4 };
		int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };
		System.out.println(Arrays.toString(solution(array, commands)));
	}
}
