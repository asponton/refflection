package br.com.reflection;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

public class DepenaMetodosDeUmaClasse {

	@SuppressWarnings("unused")
	private int funcao1(Object objeto, int x) throws NullPointerException{
		if (objeto == null) {
			throw new NullPointerException();
		}
		return x;
	}
	
	public static void main(String[] args) {
		try {
			Class<?> cls = Class.forName(DepenaMetodosDeUmaClasse.class.getName());
			Method listaMetodos[] = cls.getDeclaredMethods();  
			for (Method method : listaMetodos) {
				System.out.println("Nome metodo: " + method.getName());
				System.out.println("Membro da Classe: " + method.getDeclaringClass());
				System.out.println("Modificador: " + Modifier.toString(method.getModifiers()));
				System.out.println("Tipo de Retorno: " + method.getReturnType());				

				Class<?> parametros[] = method.getParameterTypes();
				for (int i = 0; i < parametros.length; i++) {
					System.out.println("parâmetro #" + i + " = " + parametros[i]);
				}
				
				Class<?> exceptions[] = method.getExceptionTypes();
				for (int i = 0; i < exceptions.length; i++) {
					System.out.println("exceção #" + i + " = " + exceptions[i]);
				}
			}
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}

}
