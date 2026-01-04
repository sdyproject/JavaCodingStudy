package algorithm.programmers.Lv1;

public class 유연근무제 {

	public static void main(String[] args) {
		
		//해결못함
//		int[] schedules = {700, 800, 1100}; 
//		int[][] timelogs = {{710, 2359, 1050, 700, 650, 631, 659},{800, 801, 805, 800, 759, 810, 809},{1105, 1001, 1002, 600, 1059, 1001, 1100}}; 
//		int startday = 5;
		
		
		int[] schedules = {730, 855, 700, 720}; 
		int[][] timelogs = {{710, 700, 650, 735, 700, 931, 912},{908, 901, 805, 815, 800, 831, 835},
							{705, 701, 702, 705, 710, 710, 711}, {707, 731, 859, 913, 934, 931, 905}}; 
		int startday = 1;
		
		int answer = schedules.length;
		
		//startday = 5 알때 1,2 인덱스 continue
		 //4일때 2,3,
		// 3일때 3,4
		//2일때 4,5
		//1일때 5,6
		
		for(int i =0; i<schedules.length; i++) {
			for(int j = 0; j<timelogs[0].length; j++) {
				
				if(startday == 5) {
					if(j==1 || j==2) {
						continue;
					}
				}else if(startday==4) {
					if(j==2 || j==3) {
						continue;
					}
				}else if(startday==3) {
					if(j==3 || j==4) {
						continue;
					}
				}else if(startday==2) {
					if(j==4 || j==5) {
						continue;
					}
				}else{
					if(j==5 || j==6) {
						continue;
					}
				}
				int group = schedules[i]+10;
				if(group<timelogs[i][j]) {
					answer--;
					break;
				}
				
				
			}
		}
		System.out.println(answer);
		
	}

}
