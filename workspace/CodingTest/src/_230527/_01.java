package _230527;


public class _01 {
	// luk = n / 2 -> left와 의 right합이 동일할 때 발생,럭키펀치를 사용할 수있다면 lucky,없다면 ready라는 단어를 출력

	public static void main(String[] args) {
		int n = 123402;
        int left = 0;
        int right = 0;
        String str = Integer.toString(n);
        
        
        for (int i = 0; i < str.length() / 2; i++)
            left += Character.getNumericValue(str.charAt(i));
        for (int j = str.length() / 2; j < str.length(); j++)
            right += Character.getNumericValue(str.charAt(j));

        if (left == right)
            System.out.println("LUCKY");
        else
            System.out.println("READY");
        
        System.out.println();
    }
}