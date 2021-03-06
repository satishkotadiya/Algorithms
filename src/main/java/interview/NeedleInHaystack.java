package interview;

public class NeedleInHaystack {
	/**
	 * find needle in haystack 
	 * @param haystack a sorted list 
	 * @param needle
	 * @return i such that <code>haystack[i] == needle</code>, or -1 if it is not found
	 * binary search
	 * 
	 */
	public static int find(char[] haystack, char needle) {
		int minWindow = 0; // lower bound of the search
		int maxWindow = haystack.length - 1; // upper bound of the search
		int midpoint = (maxWindow + minWindow) / 2;

		while (maxWindow - minWindow > 1) {
			if (haystack[midpoint] == needle) {
				return midpoint;
			}
			if (haystack[maxWindow] == needle) {
				return maxWindow;
			}
			if (haystack[minWindow] == needle) {
				return minWindow;
			}
			if (haystack[midpoint] < needle) {
				minWindow = midpoint;
			}
			else if (haystack[midpoint] > needle) {
				maxWindow = midpoint;
			}
			midpoint = (maxWindow + minWindow) / 2;
		}

		return -1;
	}
	
	public static void main(String[] args){
		
		char[]Haystack = {'a','d','e','b','c'};
		System.out.println(Haystack[find(Haystack,'b')]);
		
	}
	
}
