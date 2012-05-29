package br.com.reflection;

import java.lang.reflect.Method;

public class ListaMetodos {

	/**
	 * @param args
	 */
	public static void main(String args[]) {  
        try {  
            Class<?> c = Class.forName(String.class.getName());  
            Method m[] = c.getDeclaredMethods();  
            for (int i = 0; i < m.length; i++) {  
            System.out.println(m[i].toString());  
        }  
    }  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
    }

}
