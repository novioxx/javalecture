package _230610;

public class _06 {
	// 가위바위보
	// 가위는 2 바위는 0 보는 5로, rsp에 저장된 가위 바위 보를 모두 이기는 경우를 순서대로 나타낸 문자열을 return
	public String solution(String rsp) {
		String answer = "";
		String[] str = rsp.split("");

		for (int i = 0; i < rsp.length(); i++) {
			if (str[i].equals("2")) {
				answer += "0";
			} else if (str[i].equals("0")) {
				answer += "5";
			} else if (str[i].equals("5")) {
				answer += "2";
			}
		}

		return answer;
	}
}