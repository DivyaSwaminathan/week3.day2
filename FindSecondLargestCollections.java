package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class FindSecondLargestCollections {

	public static void main(String[] args) {
		int[] data= {3,2,11,4,6,7,3};
		
		List<Integer> myList=new ArrayList<Integer>();
		
		for ( int i=0; i<data.length;i++) {
			myList.add(data[i]);
		}
		Collections.sort(myList);
		System.out.println(myList);
		System.out.println("The second largest element is "  + myList.get(myList.size()-2));
	}


}
