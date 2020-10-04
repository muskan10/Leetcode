/*package whatever //do not write package name here */

import java.util.*;
import java.lang.*;
import java.io.*;

class KnapSack {
    public static int knap(int arr[],int[] wt,int n,int w){
        int t[][]=new int[n+1][w+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<w+1;j++){
                if(i==0 || j==0){
                    t[i][j]=0;
                }
                else if(wt[i-1]<=j){
                    t[i][j]=Integer.max(arr[i-1]+t[i-1][j-wt[i-1]],t[i-1][j]);
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][w];
    }
	public static void main (String[] args) throws Exception{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int testCase = Integer.parseInt(br.readLine());
		for(int d=0;d<testCase;d++){
		    int n = Integer.parseInt(br.readLine());
		    int w = Integer.parseInt(br.readLine());
		    String a1 = br.readLine();
		    String a11[] = a1.split(" ");
		    int arr[]=new int[a11.length];
		    for(int i=0;i<n;i++){
		        arr[i]=Integer.parseInt(a11[i]);
		    }
		    String w1 = br.readLine();
		    String w11[] = w1.split(" ");
		    int wt[]=new int[w11.length];
		    for(int i=0;i<n;i++){
		        wt[i]=Integer.parseInt(w11[i]);
		    }
		    System.out.println(knap(arr,wt,n,w));
		}
	}
}