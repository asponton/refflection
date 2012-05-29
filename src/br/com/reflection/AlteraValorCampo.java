package br.com.reflection;
import java.lang.reflect.*;  

public class AlteraValorCampo {  
  
    public double d;  
    
    public static void main(String args[]) {  
        try {  
            Class cls = Class.forName(AlteraValorCampo.class.getName());  
            Field fld = cls.getField("d");  
            AlteraValorCampo f2obj = new AlteraValorCampo();
            System.out.println("d = " + f2obj.d);  
            fld.setDouble(f2obj, 12.34);  
            System.out.println("d = " + f2obj.d);  
        }  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
    }  
}  
