package section7;

import java.util.*;
import java.io.*;

public class 부분집합구하기_DFS {
	static int n;
	static int[] chk;
	public void DFS(int L) {
		if(L>n) {
			String temp="";
			for(int i=1; i<=n; i++) {
				if(chk[i]==1) temp+=(i+" ");
			}
			if(temp.length()>0) System.out.println(temp);
		}else {
			chk[L]=1;
			DFS(L+1);
//			for(int i=0; i<n+1; i++) {
//				if(chk[i]==1) System.out.print(i+" ");
//			}
//			System.out.println();
			chk[L]=0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		부분집합구하기_DFS T=new 부분집합구하기_DFS();
		n=3;
		chk=new int[n+1];
		T.DFS(1);
	}
}
