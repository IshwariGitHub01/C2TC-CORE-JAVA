package com.cg.corejava;

public class ArrayDemo {

	public static void main(String[] args) {
		// Every array is an object
		//Classes of objects
		
		byte[] arr1=new byte[70];
		System.out.println("Class os Array : "+arr1.getClass().getName());
		
		short[] arr2=new short[20];
		System.out.println("Class os Array : "+arr2.getClass().getName());
		
		int[] arr=new int[20];
		System.out.println("Class os Array : "+arr.getClass().getName());
		
		long[] arr3=new long[20];
		System.out.println("Class os Array : "+arr3.getClass().getName());
		
		float[] arr4=new float[20];
		System.out.println("Class os Array : "+arr4.getClass().getName());
		
		double[] arr5=new double[20];
		System.out.println("Class os Array : "+arr5.getClass().getName());
		
		String[] arr6=new String[20];
		System.out.println("Class os Array : "+arr6.getClass().getName());    //Ljava.lang.String
	}

}
