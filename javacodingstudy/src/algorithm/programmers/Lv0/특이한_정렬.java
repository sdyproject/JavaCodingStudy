package algorithm.programmers.Lv0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class 특이한_정렬 {
//해결못함
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());

		int[] numlist = { 1, 2, 3, 4, 5, 6};

//		int[] numlist = {10000,20,36,47,40,6,10,7000};

		
		
		
		int[] num = new int[numlist.length];
		
		for (int i = 0; i < numlist.length; i++) {
			num[i] = Math.abs(numlist[i] - n);
		}
		System.out.println(Arrays.toString(num));
		
		List<Integer> list = new ArrayList<>();
		int index = 0;
		
		
		for (int i = 0; i < num.length; i++) {
			for (int j = num.length-1; j >= 0 ; j--) {
				if(index == num[j]) {
					list.add(numlist[j]);
					index++;
				}
				
			}
		}
		
		
		System.out.println(list);
//		Map<Integer, Integer> map = new TreeMap<>();
//		for (int i = 0; i < numlist.length; i++) {
//			map.put(   Math.abs(numlist[i]-n),numlist[i]);
//		}
//		System.out.println(map);
//		
//		List<Integer> list = new ArrayList<>();
//		for(Integer i : map.keySet()) {
//			list.add(i);
//		}
//		Collections.sort(list);
//		System.out.println(list);

//		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(map.get(i));
//		}
		
//		int[] num = new int[numlist.length];
//		List<Integer> list = new ArrayList<>();
//		Map<Integer, Integer> map = new TreeMap<>();
//		for (int i = 0; i < numlist.length; i++) {
//			map.put (numlist[i],(int) Math.abs(numlist[i]-n));
//			num[i] = Math.abs(numlist[i] - n);
//		}
//		Arrays.sort(num);
//		System.out.println(map);
//		System.out.println(Arrays.toString(num));
		
//		int index = 0;
//		for(Integer x : map.values()) {
//			for (int i = 0; i < num.length; i++) {
//				if(x <= index) {
//				list.add(numlist[i]);
//				}
//				System.out.println(list);
//			}
//		}
		
//		System.out.println(list);
		
		
		
		
	}

}
