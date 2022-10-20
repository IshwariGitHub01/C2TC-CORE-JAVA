package com.cg.corejava;

public class MultiDimentionalArray {

	public static void main(String[] args) {
		// MultiDimentional Array
		
		byte[][] arr=new byte[3][5];
		
		System.out.println(arr);
		System.out.println(arr[0][0]);
		System.out.println(arr[0]);
		
		int[][][] i= {{{1,2,3},{2,3}},{{1,1},{8,7,9}},{{6,8}}};
		
		System.out.println(i);
		System.out.println(i[0]);
		System.out.println(i[2][2]);    //It will give error of out of bound
		System.out.println(i[1][3]);    //It will give error of out of bound
		System.out.println();
		
	}

}
    
    