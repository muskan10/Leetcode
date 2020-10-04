import java.io.*;
import java.util.*;
import java.math.*;
public class SubsetSum {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		int w = in.nextInt();
		boolean[][] T = new boolean[n + 1][w + 1];
		for (int i = 0; i <= n; i++) {
			T[i][0] = true;
		}

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= w; j++)
			{
				if(arr[i-1]<=j) {
					T[i][j] = T[i - 1][j] || T[i - 1][j - arr[i - 1]];
				}
				else {
					T[i][j] = T[i - 1][j];
				}
			}
		}
		
		System.out.println();
		for(int i=0;i<n+1;i++){
			for(int j=0;j<w+1;j++){
				System.out.print(T[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(T[n][w]);
	}
}