package br.com.reflection;

import java.lang.reflect.Constructor;

public class DepenaConstrutor {


	public DepenaConstrutor() {}
	
	protected DepenaConstrutor(int i, double d) {}

	public static void main(String[] args) {
		
		try {
			Class<?> cls = Class.forName(DepenaConstrutor.class.getName());
			Constructor<?> listaConstrutores[] = cls.getDeclaredConstructors();
			
			for (Constructor<?> constructor : listaConstrutores) {
				System.out.println("Nome: " + constructor.getName());
				System.out.println("Membro da Classe: " + constructor.getDeclaringClass());
				
                Class parametrosConstrutor[] = constructor.getParameterTypes();  
                for (int j = 0; j < parametrosConstrutor.length; j++)  
                    System.out.println("parâmetro #" + j + " " + parametrosConstrutor[j]);  
			}
			
		} catch (Throwable e) {
			e.printStackTrace();
		}
		
	}

}
