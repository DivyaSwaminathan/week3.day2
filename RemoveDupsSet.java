package week3.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "We learn java basics as part of java sessions in java week1 java classes";	
		String[] str=text.split(" ");
		Set<String> mySet=new LinkedHashSet<String>();
		
		for (int i=0;i<str.length;i++) {
			mySet.add(str[i]);
		}
		System.out.println(mySet);
	}

}
