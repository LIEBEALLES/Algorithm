package Test;

import java.util.Arrays;
import java.util.Collections;

public class Solution10 {
	// 문자열 내림차순으로 배치하기
	/*
	 * 문자열 s에 나타나는 문자를 큰것부터 작은 순으로 정렬해 새로운 문자열을 리턴하는 함수, 
	 * solution을 완성해주세요. 
	 * s는 영문 대소문자로만 구성되어 있으며, 대문자는 소문자보다 작은 것으로 간주합니다.
	 * 
	 */
	public static String solution(String s) {
		String answer = "";
		String[] str = s.split("");
		//System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		//일반배열을 리스트로 변환해준 후, reverse 메소드를 이용해 반전
		Collections.reverse(Arrays.asList(str));
		System.out.println(Arrays.toString(str));
		
		//String.join("추가할 문자" , 배열)
		answer = String.join("", str);
		return answer;
	}
	
	//새롭게 안 사실
	//Collections.reverse
	//String.join
	public static void main(String[] args) {
		System.out.println(solution("Zbcdefg"));
	}

}
