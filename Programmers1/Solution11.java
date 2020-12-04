package Test;

import java.util.Arrays;

public class Solution11 {

	// 문자열 내 마음대로 정렬하기

	/*
	 * 문자열로 구성된 리스트 strings와, 정수 n이 주어졌을 때, 각 문자열의 인덱스 n번째 글자를 기준으로 오름차순 정렬하려 합니다.
	 * 예를 들어 strings가 [sun, bed, car]이고 n이 1이면 각 단어의 인덱스 1의 문자 u, e, a로 strings를
	 * 정렬합니다.
	 */
	

	/*
	 * n번째 있는 문자를 추출해서 맨 앞에다 붙이고 sort 로 정렬
	 * 그리고 substring 으로 1번지부터 answer 배열에 담아주기
	 * 
	 * 구글링 하고 깨달은 점 : comparator 을 활용해서 풀었으면 더 좋았을 것을.. 생각하지 못함
	 * 
	 */
	public static String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		
		for (int i = 0; i < strings.length; i++) {
			char tmp = strings[i].toCharArray()[n];
			//System.out.println("tmp" + i + tmp);
			strings[i] = tmp + strings[i];
			//Arrays.asList(strings[i]);
			System.out.println(strings[i]);
		}
		
		Arrays.sort(strings);
		//System.out.println(Arrays.toString(strings));
		
		for(int j = 0; j<strings.length; j++) {
			answer[j] = strings[j].substring(1);
			System.out.println("마지막" + Arrays.toString(answer));
			
		}
		return answer;
	}

	public static void main(String[] args) {
		String[] str = { "sun", "bed", "car" };
		System.out.println(Arrays.toString(solution(str, 1)));

	}
}
