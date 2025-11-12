package algorithm.backjoon.집합과_맵;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.StringTokenizer;

public class 회사에_있는_사람 {

	public static void main(String[] args) throws IOException {
		//입력
//		4
//		Baha enter
//		Askar enter
//		Baha leave
//		Artem enter
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n =  Integer.parseInt(br.readLine());
		
		Map<String, String> map  = new  HashMap<>();
		for (int i = 0; i < n; i++) {
			String recond = br.readLine();
//			System.out.println(recond);
			StringTokenizer st = new StringTokenizer(recond);
			String name = st.nextToken();
			String state  = st.nextToken();
			
			map.put(name, state);
					
		}
		
		ArrayList<String> list = new ArrayList<>();
		for(String name : map.keySet()) {
			if(map.get(name).equals("enter")) {
				list.add(name);
			}
		}
		for(String name : list) {
			System.out.println(name);
		}
	}

}
