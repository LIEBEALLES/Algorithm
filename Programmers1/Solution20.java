package Test;

public class Solution20 {

	// 자릿수 더하기
	/*
	 * 자연수 N이 주어지면, N의 각 자릿수의 합을 구해서 return 하는 solution 함수를 만들어 주세요. 예를들어 N = 123이면
	 * 1 + 2 + 3 = 6을 return 하면 됩니다.
	 * 
	 */
	public static int solution(int n) {
		int answer = 0;
		//자릿수 구하기
		// log10은 double 타입
		/*
		 * int len = (int)(Math.log10(n)+1); System.out.println("len" + len);
		 */
		
		while(n>0) {
			int il = n%10; //1의자리
			n = n/10; 

			answer += il;
		}

		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(solution(987));
	}
}
