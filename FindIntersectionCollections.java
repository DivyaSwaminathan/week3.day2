package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class FindIntersectionCollections {

	public static void main(String[] args) {
		 int[] arr1= {3,2,11,4,6,7};
		 int[] arr2= {1,2,8,4,9,7};
		 Set<Integer> mySet=new LinkedHashSet<Integer>();
		 for (int i=0;i<arr1.length;i++) {
			 mySet.add(arr1[i]);
		 }
for (int j=0;j<arr2.length;j++) {
	boolean add = mySet.add(arr2[j]);
	if(!add) {
		System.out.println(arr2[j]);
	}
	
}
	}

}
