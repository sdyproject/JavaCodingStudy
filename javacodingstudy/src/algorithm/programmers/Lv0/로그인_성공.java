package algorithm.programmers.Lv0;

public class 로그인_성공 {

    public static void main(String[] args) {
//        String[] id_pw = {"meosseugi", "1234"};
//        String[][] db = {{"rardss", "123"}, {"yyoom", "1234"}, {"meosseugi", "1234"}};

//        String[] id_pw = {"programmer01", "15789"};
//        String[][] db = {{"programmer02", "111111"}, {"programmer00", "134"}, {"programmer01", "1145"}};

        String[] id_pw = {"rabbit04", "98761"};
        String[][] db = {{"jaja11", "98761"}, {"krong0313", "29440"}, {"rabbit00", "111333"}};
        String answer = "fail";
        String id = id_pw[0];
        String pw = id_pw[1];

        for (int i = 0; i < db.length; i++) {
            if (db[i][0].equals(id) && db[i][1].equals(pw)) {
                answer = "login";
            } else if (db[i][0].equals(id)) {
                answer = "wrong pw";
            }
        }
        System.out.println(answer);
    }
}