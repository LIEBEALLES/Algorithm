package Test;

import java.util.Arrays;

public class Solution19 {

	// 이상한 문자 만들기
	/*
	 * 문자열 s는 한 개 이상의 단어로 구성되어 있습니다. 
	 * 각 단어는 하나 이상의 공백문자로 구분되어 있습니다. 
	 * 각 단어의 짝수번째 알파벳은 대문자로, 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, 
	 * solution을 완성하세요.
	 */

	public static String solution(String s) {
		String answer = "";
		String [] tmp = s.split("");
		System.out.println(Arrays.toString(tmp));
		int cnt = 0;
		
		for(int i = 0; i<tmp.length; i++) {
			if(tmp[i].contains(" ")) {
				cnt = 0;
			}else {
				if(cnt%2 == 0) {
					tmp[i] = tmp[i].toUpperCase();
					cnt++;
				}else {
					tmp[i] = tmp[i].toLowerCase();
					cnt++;
				}
			}
			answer += tmp[i];
			
		}

		return answer;
	}

	// 현모풀이
	public static String solution1(String s) {
		String answer = "";
		String[] arr = s.split("");
		for (int i = 0; i < arr.length; i++) {
			char[] arr_c = arr[i].toCharArray();
			for (int j = 0; j < arr_c.length; j++) {
				if (j % 2 == 0) {
					arr_c[j] = Character.toUpperCase(arr_c[j]);
				} else {
					arr_c[j] = Character.toLowerCase(arr_c[j]);
				}
			}
			arr[i] = String.valueOf(arr_c);
		}
		answer = String.join(" ", arr);
		return answer;
	}

	public static void main(String[] args) {
		System.out.println(solution("try hello world"));
	}

}
