package week3.day2;

import java.util.Map;
import java.util.TreeMap;

public class FindNumberOccurances {

	public static void main(String[] args) {

		int[] arr= {2,3,5,6,3,2,1,4,2,1,6,-1};

		Map<Integer,Integer> myMap=new TreeMap<Integer,Integer>();
		for (int i=0;i<arr.length;i++) {
			if(myMap.containsKey(arr[i])) {
				myMap.put(arr[i],myMap.get(arr[i]) +1);

			}
			else {
				myMap.put(arr[i], 1);
			}

		}
		System.out.println(myMap);
	}

}
