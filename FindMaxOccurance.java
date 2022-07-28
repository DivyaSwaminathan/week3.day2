package week3.day2;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FindMaxOccurance {

	public static void main(String[] args) {
		String input="abbababaaaacdfrrrtfffffffff";
		char[] chars=input.toCharArray();
		int max=0;
		char maxOccurChar=' ';
		
		Map<Character,Integer> myMap=new HashMap<Character,Integer>();
		for (int i=0;i<chars.length;i++) {
			if(myMap.containsKey(chars[i])) {
				myMap.put(chars[i], myMap.get(chars[i])+1);
			}
			else
			myMap.put(chars[i], 1);
		}
System.out.println(myMap);
for (Entry<Character,Integer> entry : myMap.entrySet()) {
	
	if(entry.getValue() > max) {
		max=entry.getValue();
		maxOccurChar=entry.getKey();
		
	}
	
}
System.out.println("the maximum occuring character is " + maxOccurChar);
	}


	
	
}
