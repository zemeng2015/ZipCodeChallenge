package test;

import java.util.*;

public class zipRange {
	
	
	public static List<int[]> zipCodeChallenge(int[][] zipArray){
		
		if(zipArray == null|| zipArray.length==0) {
			return null;
		}
		// Sort by ascending starting point
		Arrays.sort(zipArray, (i1, i2) -> Integer.compare(i1[0], i2[0]));

		List<int[]> result = new ArrayList<>();
		int[] newInterval = zipArray[0];
		result.add(newInterval);
		for (int[] interval : zipArray) {
			if (interval[0] <= newInterval[1]) 
				// Overlapping intervals, move the end if needed
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			else {                             
				// Disjoint intervals, add the new interval to the list
				newInterval = interval;
				result.add(newInterval);
			}
		}
		return result;
	}
	
	

	public static void main(String[] args) {
		int[][] inputArray = new int[][]{
			{49679, 52015}, 
			{49800, 50000}, 
			{51500, 53479}, 
			{45012, 46937}, 
			{54012, 59607}, 
			{45500, 45590}, 
			{45999, 47900}, 
			{44000, 45000}, 
			{43012, 45950}
		};
		List<int[]> result = zipCodeChallenge(inputArray);
		System.out.println("Input Value:");
		for(int[]input: inputArray) {
			System.out.print("[");
			for(int i : input) {
				System.out.print(i+" ");
			}
			System.out.println("]");
		}
		System.out.println("\nOutput Value:");
		for(int i=0; i<result.size(); i++) {
			int[] a = result.get(i);
			System.out.print("[");
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println("]");
		}
	}

}
