import java.io.*;
import java.util.*;

class EqualSubsetSum{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            String input_line[] = in.readLine().trim().split("\\s+");
            int arr[] = new int[N];
            for(int i = 0;i < N;i++)
                arr[i] = Integer.parseInt(input_line[i]);
            
            Solution ob = new Solution();
            int x = ob.equalPartition(N, arr);
            if(x == 1)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}// } Driver Code Ends


// User function Template for Java

class Solution{
    static boolean subsetsum(int A[],int n,int sum){
        boolean[][] T = new boolean[n + 1][sum + 1];

		for (int i = 0; i <= n; i++) {
			T[i][0] = true;
		}

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= sum; j++)
			{
				if(A[i-1]<=j) {
					T[i][j] = T[i - 1][j] || T[i - 1][j - A[i - 1]];
				}
				else {
					T[i][j] = T[i - 1][j];
				}
			}
		}
		return T[n][sum];
    }
    static int equalPartition(int N, int arr[])
    {
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if(sum%2!=0){
            return 0;
        }
        else{
            if(subsetsum(arr,N,sum/2)==true)
                return 1;
            else
                return 0;
        }
    }
}