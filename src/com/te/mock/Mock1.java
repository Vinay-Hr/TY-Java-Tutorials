package com.te.mock;

import com.te.arrays.Array;

public class Mock1 {

	public static void main(String[] args) {
		int Array[];
		
		int  a[] = {2,5,3,1,4,6,0,7};
		
		for(int i=0; i<a.length; i++) {
			for (int j=0; j<a.length; j++) {
				if(a[i]+a[j] == 7) {
					System.out.println(a[i]+ " + " + a[j]);
				}
			}
			
		}
		
	}

}
