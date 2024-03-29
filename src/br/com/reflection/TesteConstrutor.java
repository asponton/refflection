package br.com.reflection;
import java.lang.reflect.Constructor;

public class TesteConstrutor {  
  
    public TesteConstrutor() { }  
    
    public TesteConstrutor(int a, int b) {  
        System.out.println("a = " + a + " b = " + b);  
    }  
    
    public static void main(String args[]) {  
        try {  
            Class<?> cls = Class.forName(TesteConstrutor.class.getName());  
  
            Class<?> partypes[] = new Class[2];  
            partypes[0] = Integer.TYPE;  
            partypes[1] = Integer.TYPE;  
  
            Constructor<?> ct = cls.getConstructor(partypes);  
  
            Object arglist[] = new Object[2];  
            arglist[0] = new Integer(37);  
            arglist[1] = new Integer(47);  
  
            Object retobj = ct.newInstance(arglist);  
        }  
        catch (Throwable e) {  
            System.err.println(e);  
        }  
    }  
}  