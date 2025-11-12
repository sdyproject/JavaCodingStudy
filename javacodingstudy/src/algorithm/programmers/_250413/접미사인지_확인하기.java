package algorithm.programmers._250413;

public class 접미사인지_확인하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String my_string="banana" ;  
		String is_suffix="abanana";
		//"banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.
		int answer = 0;
		
		for(int  i = 0; i<my_string.length(); i++) {
			answer += (is_suffix.equals(my_string.substring(i))) ? 1:0; 
		}
		
		System.out.println(answer);
	}

}
// for반복분으로 통해 my_string길이만큼 i를 0부터 1씩 증가시키고
// my_string.substring(i)를 통해  my_string를 문제에 나온 *"banana"의 모든 접미사는 "banana", "anana", "nana", "ana", "na", "a"입니다.*
// 조건에 맞게 문자열을 분리하고 is_suffix와 동일한 접미사가 나오면 answer에 1를 넣어 출력 아니라면 0를 출력