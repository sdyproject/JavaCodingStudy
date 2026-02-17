package algorithm.programmers.Lv0;

public class 다음에_올_숫자 {

	public static void main(String[] args) {
		int[] common = {1,2,3,4};
//		int[] common = {2,4,8};

        int answer = 0;
        if(common[1] - common[0] == common[2] - common[1]){
            answer = common[common.length-1] + (common[2] - common[1]);
        }else{
            answer = common[common.length-1] / common[common.length-2] * common[common.length-1];
        }
		System.out.println(answer);
	}

}
