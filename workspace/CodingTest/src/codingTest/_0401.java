package codingTest;

public class _0401 {

	public int solution(int[][] lines) {
		int answer = 0;
		for (int i = 0; i < lines.length; i++) {

			for (int j = 0; j < lines[i].length; j++) {
				int[] a = lines[i];
				int[] b = lines[j];

				int start = Math.max(a[0], b[0]);
				int end = Math.min(a[j], b[j]);

				if (start <= end) {
					answer += (end - start);
				}
			}
		}
		return answer;

	}

	public static void main(String[] arg) {

		int[][] intarg = { { 0, 5 }, { 3, 9 }, { 1, 10 } };
		_0401 q = new _0401();
		System.out.println(q.solution(intarg));
	}
}
