import java.io.*;
import java.util.*;
import java.math.*;
public class Sample {
	public static boolean[][] subsetw(int arr[],int w){
		int n = arr.length;
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
		return T;
	}
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++){
			arr[i]=in.nextInt();
		}
		
		//calculate range or w of complete array
		int range=0;
		for(int i=0;i<n;i++){
			range+=arr[i];
		}
		
		boolean brr[][] = subsetw(arr,range);
		
		//now as we got the subsetw matrix we will take its last row where we get True and store it in arraylist
		ArrayList<Integer> ar = new ArrayList<Integer>();
		for(int i=n;i<n+1;i++){
			for(int j=0;j<=range/2;j++){
				if(brr[i][j]==true){
					ar.add(j);
				}
			}
		}
		
		System.out.println(ar);
		//now we find range-2S1
		int min = Integer.MAX_VALUE;
		for(int i=0;i<ar.size();i++){
			min = Math.min(min,range-(2*ar.get(i)));
		}
		System.out.println(min);
	}
}