package classexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class StringClassTest {
    public static void main(String[] args) throws ClassNotFoundException {
//        Class strClass = Class.forName("java.lang.String");
        Class strClass = Class.forName("classexam.Person");

        System.out.println(strClass.getName());
        System.out.println("*****Get all constructor information*****");
        Constructor[] cons = strClass.getConstructors();
        for(Constructor c : cons){
            System.out.println(c);
        }

        System.out.println("*****Get all member variable*****");
        Field[] fields = strClass.getDeclaredFields();
        for(Field f : fields){
            System.out.println(f);
        }

        System.out.println("*****Get all method*****");
        Method[] methods = strClass.getDeclaredMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }
}
