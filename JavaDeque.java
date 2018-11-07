/*
	In this problem, you are given N integers. You need to find,
	the maximum number of unique integers among all the possible contiguous subarrays of size M.
	
	Approach:
	1. Generate all subarrays of size M.
	2. Count unique number from subarrays.
		2.1 if the unique number, currenty we get is greater than previous max unique number, we replace previous unique number, by
		    newly get unique number.
	3. continue, untill we generate all possible subarrays.
	
	NB: the time limit should be 3 secs.
	In the sample testcase, there are 4 subarrays of contiguous numbers.

	s1 = (5,3,5)- Has 2 unique numbers.
    s2 = (3,5,2)- Has 3 unique numbers.
    s3 = (5,2,3)- Has 3 unique numbers.
	s4 = (2,3,2)- Has 2 unique numbers.

In these subarrays, there are 2,3,3,2 unique numbers, respectively. 
The maximum amount of unique numbers among all possible contiguous subarrays is 3 .

url: https://www.hackerrank.com/challenges/java-dequeue/problem
*/
import java.util.*;

class JavaDeque{
	static Scanner inp = new Scanner(System.in);
	static int size, part;
	static int unique;
	
	public static void main(String [] args){
		size = inp.nextInt();
		part = inp.nextInt();
		int [] array = new int[size];
		
		for(int i=0; i<size; i++){
			array[i] = inp.nextInt();
		}
		
		for(int i=0;;i++){
			if((size - i)+1 == part)
				break;
			
			function(array, i, part+i);
		}
		
		System.out.println(unique);
	}
	
	static void function(int [] array, int in, int part){
		int count = 1;
		
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(array[in], 1);
		for(int i=in+1; i<part; i++){
			if(!map.containsKey(array[i])){				
				map.put(array[i], 1);
				count++;
				continue;
			}						
		}

		if(count > unique)
			unique = count;
	}
}