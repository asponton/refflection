package br.com.reflection;

public class InstanceOf {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName(Integer.class.getName());
			boolean b1 = cls.isInstance(new Integer(37));  
			boolean b2 = cls.isInstance(new java.lang.String("teste"));
			
			System.out.println(b1 + "," + b2);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}  
	}

}
