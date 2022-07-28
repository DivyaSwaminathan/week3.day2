package week3.day2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElemetInArray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		//System.out.println(arr[0]);
		List<Integer> myList=new ArrayList<Integer>();

	for (int i=0;i<arr.length;i++) {
		
		myList.add(i,arr[i]);
		if (myList.get(i)!=i+1) {
			System.out.println("The missing element in Array is " +(i+1));
			break;
		}
	}
//	System.out.println(myList);
		
	}
}

