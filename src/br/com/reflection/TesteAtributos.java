package br.com.reflection;
import java.lang.reflect.*;  

public class TesteAtributos {  
  
    private double d;  
    public static final int i = 37;  
    String s = "testing";  
    
    public static void main(String args[]) {  
        try {  
            Class<?> cls = Class.forName(TesteAtributos.class.getName());  
        
            Field fieldlist[] = cls.getDeclaredFields();  
            for (int i = 0; i < fieldlist.length; i++) {  
                Field fld = fieldlist[i];  
                System.out.println("nome atributo = " + fld.getName());  
                System.out.println("membro da classe = " + fld.getDeclaringClass());  
                System.out.println("tipo = " + fld.getType());  
                int mod = fld.getModifiers();  
                System.out.println("modificadores = " + Modifier.toString(mod));  
            }  
        }  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
    }  
}