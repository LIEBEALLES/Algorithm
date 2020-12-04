package Test;

public class Solution05 {

	//평균구하기
	/*
	 * 정수를 담고있는 배열 arr의 평균값을 return 하는 함수 solution을 완성
	 * 
	 * */
	   public static double solution(int[] arr) {
	        double answer = 0;
	        int sum = 0;
	        for(int i =0; i<arr.length; i++) {
	        	sum += arr[i];
	        }
	        //평균구하기
	       answer = sum / (double) arr.length;
	       
	        return answer;
	   }
	   
	   public static void main(String[] args) {
		int[] arr = {1,2,3,4};
		System.out.println(solution(arr));
	}
}
