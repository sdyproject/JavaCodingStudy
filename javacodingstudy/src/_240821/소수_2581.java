package _240821;

import java.util.Arrays;
import java.util.Scanner;

public class 소수_2581 {
	// 소수 여부 저장될 배열 선언
	// boolean배열 선언으로 소수 여부 명확하게 표현 
	// int 배열 선언 시 복잡하게 코드 진행 + 추가 정보 저장하여 사용됨
	public static boolean Prime_array[];
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in); 
        
        int M = sc.nextInt(); 
        int N = sc.nextInt(); 
		
        sc.close();
     // N+1 배열 설정 인덱스 0부터 N까지 사용
		Prime_array = new boolean[N + 1]; 
		System.out.println("length :"+Prime_array.length);
		System.out.println("length2 : "+Math.sqrt(+Prime_array.length));
        getprime(); 
        
        int sum = 0; 
        // Integer.MAX_VALUE 
        //초기값은 int형 최대값으로 설정하여 사용
        int min = Integer.MAX_VALUE; 
        
        for(int i = M; i <= N; i++) { 
            if(Prime_array[i] == false) { 
                sum += i; 
                
             // 첫 번째 소수를 min에 저장
                if(min == Integer.MAX_VALUE) { 
                    min = i;
                }
            }
        }
        
        if(sum == 0) { 
            System.out.println(-1); 
        }
        else {
            System.out.println(sum); 
            System.out.println(min); 
        }
    }
    
    public static void getprime() {
    	//0,1은 소수가 아니기 때문에 true
    	Prime_array[0] = true; 
    	Prime_array[1] = true; 
        for(int i = 2; i <= Math.sqrt(Prime_array.length); i++) {
            if(Prime_array[i] == false) {
                for(int j = i * i; j < Prime_array.length; j += i) { 
                	Prime_array[j] = true; 
                	
                }
            }
        }
		System.out.println(Arrays.toString(Prime_array));
	
	}

}
