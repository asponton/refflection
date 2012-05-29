package br.com.reflection;

import java.lang.reflect.Array;

public class Arrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	   
		try {
			 Class<?> cls = Class.forName(Arrays.class.getName());
		    Object array = Array.newInstance(cls, 10);  
		    Array.set(array, 5, 5);  
		    int s = (Integer)Array.get(array, 5);  
		    System.out.println(s);  
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
	}

}
