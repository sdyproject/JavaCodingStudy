package _240904;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Member {
    int age;
    String name;
    int input; // 가입 순서를 위한 필드

    public Member(int age, String name, int input) {
        this.age = age;
        this.name = name;
        this.input = input;
    }
}

public class 나이순정렬_10814 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();  // 버퍼 비우기

        Member[] members = new Member[N];
        for (int i = 0; i < N; i++) {
            int age = sc.nextInt();
            String name = sc.next();
            members[i] = new Member(age, name, i); // i는 입력 순서
        }

        // 나이순으로 정렬, 나이가 같으면 입력된 순서대로 정렬
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member m1, Member m2) {
                if (m1.age == m2.age) {
                    return Integer.compare(m1.input, m2.input);
                } else {
                    return Integer.compare(m1.age, m2.age);
                }
            }
        });

        for (Member member : members) {
            System.out.println(member.age + " " + member.name);
            System.out.println("순서 : "+member.input);
        }
        
        
        /*
		 * // 해결 하지 못한 코드 Scanner sc = new Scanner(System.in); int N = sc.nextInt();
		 * sc.nextLine(); String[] arr = new String[N]; for(int i = 0; i<arr.length;
		 * i++) { arr[i]= sc.nextLine(); }
		 * 
		 * 
		 * 
		 * Arrays.sort(arr);
		 * 
		 * for(String total: arr) { System.out.println(total); }
		 * 
		 * 출력 : 20 Sunyoung 
		 *       21 Dohyun
		 * 		 21 Junkyu
		 */
    }
}

