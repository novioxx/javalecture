package _230605;

public class _09 {
	public int solution(int n) {
		int answer = 0;
		String[] arr = String.valueOf(n).split("");

		for (String str : arr)
			answer += Integer.parseInt(str);

		return answer;
	}
}
