package array;

import java.util.LinkedHashSet;

public class UniqueElementsInArray {
	
	public static void main(String[] args) {
		
		int[] a={2,4,1,4,3,5,2};

		LinkedHashSet<Integer> set = new LinkedHashSet<>();

		for(int i=0; i<a.length; i++)
		{
		set.add(a[i]);
		}

		System.out.println(set);
	}

}
