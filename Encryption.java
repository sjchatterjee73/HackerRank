
/* url : https://www.hackerrank.com/challenges/encryption/problem?isFullScreen=false 
	coder: sj .:)
*/
import java.util.Scanner;

public class Encryption {
	private static String removeSpace(String s) {
		String temp = "";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i) != ' ')
				temp += s.charAt(i);
		}
		return temp;
	}
	private static void print(int x, int n, char [][] matrix) {
		if(x == n) return;
		
		for(int i=0; i<matrix.length; i++) {			
			char [] a = matrix[i];
			if(a[x] == '\u0000')
				break;			
			System.out.print(a[x]);
			
		}
		System.out.print(" ");
		
		print(x+1, n, matrix);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String s = input.nextLine();
		
		s = removeSpace(s);
		
		int len = s.length();
		
		double newlen = Math.sqrt(len);
		double floor = Math.floor(newlen);
		double ceil = Math.ceil(newlen);

		char [][] matrix = null;		

		if(floor * ceil > len) 
			matrix = new char[(int)floor][(int)ceil];

		else if(floor * ceil < len && floor > ceil)
			matrix = new char[(int)floor][(int)floor]; 

		else
			matrix = new char[(int)ceil][(int)ceil];

		
		for(int i=0, x=0; i<matrix.length; i++) {
			for(int j=0; j<matrix[i].length; j++) {
				if(x == s.length()) break;
				matrix[i][j] = s.charAt(x);
				x++;
			}
		}
		
		print(0, (int)ceil, matrix);
		input.close();
	}
}
