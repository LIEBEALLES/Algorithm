package Test;

public class FindingMrkim {
	//프로그래머스 김서방찾기 
	
	public static void main(String[] args) {
		String[] answer = new String[] {"choi", "Kim"};
		
		
		int index = 0;
		for(String s : answer) {
			if(s.equals("Kim")) {
				System.out.println("김서방은" + index++ + "에 있다");
			}
			index++;
		}
		
	}

}


