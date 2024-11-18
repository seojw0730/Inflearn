package section9;

import java.util.*;
import java.io.*;

public class 친구인가 {
	static int[] unf;
	
	public static int Find(int v) {
		if(v==unf[v]) return v;
		else return unf[v]=Find(unf[v]); // 킥
	}
	
	public static void Union(int a, int b) {
		int fa=Find(a);
		int fb=Find(b);
		if(fa!=fb) unf[fa]=fb;
	}
	
	public static void main(String[] args) throws Exception {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		String[] temp1=br.readLine().split(" ");
		int n=Integer.parseInt(temp1[0]);
		int m=Integer.parseInt(temp1[1]);
		unf=new int[n+1];
		for(int i=1; i<=n; i++) unf[i]=i;
		for(int i=0; i<m; i++) {
			String[] temp2=br.readLine().split(" ");
			int a=Integer.parseInt(temp2[0]);
			int b=Integer.parseInt(temp2[1]);
			Union(a, b);
		}
		String[] temp3=br.readLine().split(" ");
		br.close();
		int a=Integer.parseInt(temp3[0]);
		int b=Integer.parseInt(temp3[1]);
		int fa=Find(a);
		int fb=Find(b);
		if(fa==fb) bw.append("YES");
		else bw.append("NO");
		bw.close();
	}
}
