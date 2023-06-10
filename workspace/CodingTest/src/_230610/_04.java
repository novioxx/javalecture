package _230610;

public class _04 {
	//개미군단
	//장군개미 5, 병정개미 3, 일개미1 의 전투력을 가지고 사냥감 체력 hp에 딱 맞게 나갈 최소 병력
	 public int solution(int hp) {
		 return (hp / 5) + ((hp % 5) / 3) + ((hp % 5) % 3);
	    }
	}
