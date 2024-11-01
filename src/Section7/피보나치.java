package Section7;

import java.io.*;
import java.util.*;

public class 피보나치 {
	static int[] fibo;
	public int DFS(int n) {
		if(fibo[n-1]>0) return fibo[n-1];
		else if(n<=2) return fibo[n-1]=1;
		else return fibo[n-1]=DFS(n-1)+DFS(n-2);
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int n=Integer.parseInt(br.readLine());
		br.close();
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		피보나치 T=new 피보나치();
		fibo=new int[n];
		T.DFS(n);
		for(int i=0; i<n; i++) {
			bw.append(fibo[i]+" ");
		}
		bw.close();
		return;
	}
}
