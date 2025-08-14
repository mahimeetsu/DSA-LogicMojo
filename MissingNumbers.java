package com.dsa.bits;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MissingNumbers {
	public static void main(String[] args) {
		List<Integer> list1 = new ArrayList<>();
		list1.add(203);
		list1.add(204);
		list1.add(205);
		list1.add(206);
		list1.add(207);
		list1.add(208);
		list1.add(203);
		list1.add(204);
		list1.add(205);
		list1.add(206);
		// List<Integer> list2 = Arrays.asList(203, 204, 204, 205, 206, 207, 205, 208,
		// 203, 206, 205, 206, 204);
		List<Integer> list2 = new ArrayList<>();
		list2.add(203);
		list2.add(204);
		list2.add(204);
		list2.add(205);
		list2.add(206);
		list2.add(207);
		list2.add(205);
		list2.add(208);
		list2.add(203);
		list2.add(206);
		list2.add(205);
		list2.add(206);
		list2.add(204);
		// System.out.println(missingNumbers(list1, list2));
		System.out.println(missingNumbersMap(list1, list2));

	}

	public static List<Integer> missingNumbers(List<Integer> arr, List<Integer> brr) {
		// arr=new ArrayList<>();
		// brr=new ArrayList<>();
		System.out.println(arr.size() + " " + brr.size());
		List<Integer> missingList = new ArrayList<Integer>();
		for (int i = 0; i < brr.size(); i++) {
			if (arr.contains(brr.get(i))) {
				// brr.ge;
			} else {
				missingList.add(brr.get(i));
			}
		}

		return missingList;
	}

	public static List<Integer> missingNumbersMap(List<Integer> arr, List<Integer> brr) {
		List<Integer> missingList = new ArrayList<Integer>();
		Map<Integer, Integer> bFreqMap = new HashMap<>();
		for (int i : brr) {
			bFreqMap.put(i, bFreqMap.getOrDefault(i, 0) + 1);
		}
		System.out.println(bFreqMap);

		for (int j : arr) {
			if (bFreqMap.containsKey(j)) {
				bFreqMap.put(j, bFreqMap.getOrDefault(j, 0) - 1);
			}
		}
		System.out.println(bFreqMap);

		for (Map.Entry<Integer, Integer> map : bFreqMap.entrySet()) {
			System.out.println(map.getKey() + " " + map.getValue());
			if (map.getValue() > 0) {
				missingList.add(map.getKey());
			}
		}

		return missingList;
	}
}
