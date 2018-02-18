package simple;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GCDUsingRecursive {

	//�ִ� ����� �� Recursive
	public static int gcdR(int m, int n){
		int temp =0;
		prints(m,n);
		if(m==n){
			temp=m;
		}else if(m>n){
			temp = gcdR(m-n,n);
		}else if(m<n){
			temp = gcdR(m,n-m);
		}
		return temp;
	}
		
	public static int lcmR(int m, int n){
		return (m*n)/gcdR(m,n);
	}
	
	public static void prints(int m, int n){
		System.out.println("("+m+","+n+")");
	}
		
}