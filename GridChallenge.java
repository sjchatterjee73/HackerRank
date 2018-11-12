/*
	Naive Approach: 
	
	1. sort every index of string array. 
	2. make every index of string array into char array and store every index of char array into an auxilary array. 
	3. check index of each char array 
		3.1 if it is greater and equal of previous indexes then, replace every index of auxilary array, with new array 
		3.2 else, return the value 'false', cause it is not column-wise sorted. 
	4. repeat, step 3 until we reach last index of string array.
	
	url: https://www.hackerrank.com/challenges/grid-challenge/problem?utm_campaign=challenge-recommendation&utm_medium=email&utm_source=24-hour-campaign
*/

import java.util.*;

class GridChallenge{
	static Scanner inp = new Scanner(System.in);
	static String str;
	static int t,n;
	static int [] index;
	
	static void initializeArray(int len){
		index = new int[len];
	}
	static boolean pass(String [] temp){
		for(int i=0; i<temp.length; i++){
			char [] array = temp[i].toCharArray();
			Arrays.sort(array);
			String t = String.valueOf(array);
			temp[i] = t;
		}
		initializeArray(temp[0].length());
		for(int i=0; i<temp.length; i++){
			char [] array = temp[i].toCharArray();
			if(!isTrue(array, i))
				return false;
		}
		return true;
	}
	static boolean isTrue(char [] array, int in){
		for(int i=0; i<array.length; i++){
			if(in == 0){
				index[i] = array[i];
				return true;
			}
			
			int m = array[i];
			if(m >= index[i])
				index[i] = m;
			else
				return false;
		}
		return true;
	}
	public static void main(String [] args){
		t = inp.nextInt();
		
		while(t-- >0){
			n = inp.nextInt();
			String [] array = new String[n];
			for(int i=0; i<n; i++){
				array[i] = inp.next();
			}
			
			if(pass(array))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}