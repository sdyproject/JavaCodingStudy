package algorithm.programmers.Lv1;

public class 삼총사 {

    //	static int count;
    public static void main(String[] args) {
        /*각각 정수 번호 가짐
         * 3명의 정수 번호 더했을때 0 되면 삼총사로 부름
         * */

//        int[] number = {-2, 3, 0, 2, -5};
//        int[] number = {-3, -2, -1, 0, 1, 2, 3};
        int[] number = {-1, 1, -1, 1};

        int answer = 0;
        for (int i = 0; i < number.length - 2; i++) {
            for (int j = i + 1; j < number.length - 1; j++) {
                for (int k = j + 1; k < number.length; k++) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++;


                    }
                }
            }


//		three(number,0,0,0);
//
//
//		System.out.println(count);
        }
        System.out.println(answer);

//	public static void three(int[] number, int index,int depth, int sum) {
//		if(depth==3) {
//			if(sum == 0)  count++;
//			return ;
//		}
//
//
//		for (int i = index; i < number.length; i++) {
//			 three(number, i+1, depth+1, sum+number[index]);
//		}


    }

}
