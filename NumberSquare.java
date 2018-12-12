/*
	https://www.hackerrank.com/contests/moodys-analytics-2018-women-in-engineering/challenges/numbers-square/problem
*/
import java.util.*;

class NumberSquare{
	static int count = 0, k = 0;
	static void getFill(int [][] array, int i, int x){
		int m = i, n = x;
		while(true){
			if(i==n && m ==x+1)
				break;
			
			if(x>i){
				array[i][x] = k++;
				i++;
			}
			
			if(i >= x){
				array[i][x] = k++;
				x--;
			}
		}
		count++;
	}
	static void getFillOne(int [][] array){
		array[0][0] = k++;
		array[0][1] = k++;
		array[1][1] = k++;
		array[1][0] = k++;
		count += 2;
		return;
	}
	public static void main(String [] args){
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		
		int [][] array = new int[n][n];
		k = inp.nextInt();
		
		getFillOne(array);
		int i = 0, x = 1;
		
		while(count<n){
			getFill(array, i, ++x);
		}
		
		for(i=0; i<n; i++){
			for(int j=0; j<n; j++){
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}