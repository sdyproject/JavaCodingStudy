package algorithm.backjoon.정렬;

import java.util.*;

public class 단어_정렬 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        Set<String> set = new HashSet<>();
        for (int i = 0; i < N; i++) {
            set.add(sc.next());
        }
        List<String> list = new ArrayList<>(set);
        Collections.sort(list, new Comparator<String>() {


            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
