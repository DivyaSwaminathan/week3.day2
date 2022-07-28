package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class ArrayDupsCollections {

	public static void main(String[] args) {
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println("The Duplicates in the array are  as follows:");
		Set<Integer> mySet=new LinkedHashSet<Integer>();
		for (int i=0;i<arr.length;i++) {
			boolean add = mySet.add(arr[i]);
			if(!add) {
				System.out.println(arr[i]);
				
			}
		}

	}

}
