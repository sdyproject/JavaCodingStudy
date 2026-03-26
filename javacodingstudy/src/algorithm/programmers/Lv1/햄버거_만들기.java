package algorithm.programmers.Lv1;

public class 햄버거_만들기 {

    public static void main(String[] args) {
        int[] ingredient = {2, 1, 1, 2, 3, 1, 2, 3, 1}; //2
//        int[] ingredient = {1, 3, 2, 1, 2, 1, 3, 1, 2}; //0
        //빵 1 야채 2 고기 3  빵 1
        int answer = 0;
        StringBuilder sb = new StringBuilder();
        for (int num : ingredient) {
            sb.append(num);
            if (sb.length() >= 4 && sb.substring(sb.length() - 4).equals("1231")) {
                sb.delete(sb.length() - 4, sb.length());
                answer++;
            }
        }
        System.out.println(answer);

        // 시간초과
//        String line = "";
//        for (int num : ingredient) {
//            line += num;
//            if (line.length() >= 4 && line.contains("1231")) {
//                line = line.replace("1231", "");
//                answer++;
//            }
//        }

//        System.out.println(answer);

    }


    //중복이 될 수 있는 것을 확인하지 못해서 실패
//		int answer = 0;
//		
//		StringBuilder sb = new StringBuilder();
//		for(int num : ingredient) {
//			sb.append(num);
//		}
//		
//		for(int i =0; i<sb.length()-3; i++) {
//			
//			String a=sb.substring(i, i+4);
//			System.out.println(a);
//			if(a.equals("1231")) {
//				answer++;
//			}
//		}
//		System.out.println(answer);


//		int answer = 0;
//
//		StringBuilder sb = new StringBuilder();
//		for(int num : ingredient) {
//			sb.append(num);
//
//			if (sb.length() >= 4 && sb.substring(sb.length() - 4).equals("1231")) {
//				//1234일시 데이터를 삭제해 앞으로 수를 땡겨서 다시 진행
//                sb.delete(sb.length() - 4, sb.length());
//                answer++;
//            }
//
//		}
//
//
//		System.out.println(answer);
}


