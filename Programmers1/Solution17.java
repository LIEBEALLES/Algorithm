package Test;

import java.util.ArrayList;
import java.util.Arrays;

public class Solution17 {

	public static int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		int num = 10; //arr의 원소의 크기는 0보다 크거나 같고 9보다 작거나 같은 정수이기 때문
		//System.out.println(arr.length); 7
		//0 1 2 3 4 5 6
		for (int i = 0; i < arr.length; i++) {
			if(num != arr[i]) { //당연히 true
					list.add(arr[i]); //list에 값을 넣어주고 다시 if문 돌기
					num = arr[i];
				
			}
		}

		int[] answer = new int[list.size()];
		System.out.println("길이" + list.size());
		for (int i = 0; i < list.size(); i++) {
			answer[i] = list.get(i);
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] arr = { 1,1,3,3,0,1,1 }; // [1,3,0,1]
		System.out.println(Arrays.toString(solution(arr)));
	}
}
