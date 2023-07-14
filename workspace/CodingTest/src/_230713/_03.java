package _230713;

public class _03 {
	//배열 길이의 따라 다른 연산하기
	//배열 길이가 짝수라면 홀수 인덱스 위치에 n 값을 더해주고,배열 길이가 홀수라면 짝수 인덱스 위치에 n 값을 더해줭
	public int[] solution(int[] arr, int n) {
        int[] answer = new int[arr.length];
        if(arr.length%2==0){
            for(int i=0;i<arr.length;i++){
                if(i%2==1){
                    answer[i]=arr[i]+n;
                }else{
                    answer[i]=arr[i];
                }
            }
        }else{
            for(int i=0;i<arr.length;i++){
                if(i%2==0){
                     answer[i]=arr[i]+n;
                }else{
                    answer[i]=arr[i];
                }
            }
        }
        return answer;
    }

}
