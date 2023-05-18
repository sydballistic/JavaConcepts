package org.exception;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.concurrent.ArrayBlockingQueue;

public class ExceptionHandling {

	public static void main(String[] args) {

		// Arithmetic Exception------------------------->

		int a = 100;
		int b = 0;

		try {

			System.out.println(a / b);
		} catch (ArithmeticException e) {
		} catch (Exception e) {

		} finally {

		}

		// Null pointer Exception------------------------------->

		TreeMap<String, String> ma = new TreeMap<>();

		try {
			ma.put(null, "10");
			ma.put(null, null);
			System.out.println(ma);
		} catch (NullPointerException e) {
		} catch (Exception e) {

		} finally {

		}

		// Index Out Of bounds Exception----------------------->

		List li = new ArrayList<>();

		li.add(10);
		li.add(20);
		li.add(30);

		try {
			Object object = li.get(3);

			System.out.println(object);
		} catch (IndexOutOfBoundsException e) {

		} catch (Exception e) {

		} finally {

		}
		
		
		//ArrayIndexOutBoundExcepetion---------------------------->
		
		int [] arr=new int[3];
	try{	
		arr[0]=1;
		arr[1]=2;
		arr[2]=3;
		arr[3]=4;
		
	}catch(ArrayIndexOutOfBoundsException e){
		
	}catch (Exception e) {
		
		
	}
		
		//String IndexOutBoundExcepetion------------------------------>
		
		String s="java";
		
		char c = s.charAt(4);
		
		System.out.println(c);

	}
	
	//ClassCastException-------------------------------------->
	
	Set<Integer> s=new TreeSet<>();
	
	

}
