package algorithm.programmers.Lv0;

public class 외계어_사전 {
    public static void main(String[] args) {
//        String[] spell = {"p", "o", "s"};
//        String[] dic = {"sod", "eocd", "qixm", "adio", "soo"};
//      출력 : 2

//        String[] spell = {"z", "d", "x"};
//        String[] dic = {"def", "dww", "dzx", "loveaw"};
//      출력 : 1

        String[] spell = {"s", "o", "m", "d"};
        String[] dic = {"moos", "dzx", "smm", "sunmmo", "som"};
//      출력 : 2
        int answer = 2;

        for (int i = 0; i < dic.length; i++) {
                boolean check = true;
            for (int j = 0; j < spell.length; j++) {
               if(!dic[i].contains(spell[j])){
                   check = false;
               }
            }
            if(check){
                answer = 1;
            }
        }
        System.out.println(answer);

    }
}
