package algorithm.backjoon.심화_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.StringTokenizer;

public class 영단어_암기는_괴로워 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		
		HashMap<String, Integer> map  = new HashMap<>();
		for (int i = 0; i < N; i++) {
			String word = br.readLine();
			if(word.length() >= M) {
				map.put(word, map.getOrDefault(word, 0) +1);
			}
		}
		System.out.println(map);
		
		
		List<String> list = new ArrayList<>(map.keySet());
		Collections.sort(list, new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				int count  =  map.get(o2).compareTo(map.get(o1));
				if(count !=0) return count;
				
				int len = Integer.compare(o2.length(), o1.length());
				if(len !=0) {
					return len;
				}
				
				return o1.compareTo(o2);
			}
		});
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(String s : list) {
			bw.write(s +"\n");
		}
		bw.flush();
		bw.close();
	}

}
