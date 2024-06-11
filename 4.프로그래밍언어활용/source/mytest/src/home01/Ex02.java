package home01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex02 {
    public static void main(String[] args) throws ClassNotFoundException{
        Person person = new Person();
        Class pClass1 = person.getClass();
        System.out.println(pClass1.getName());

        Class pClass2 = Person.class;
        System.out.println(pClass2.getName());

        Class pClass3 = Class.forName("home01.Person");
        System.out.println(pClass2.getName());

        System.out.println("Constructor-----------");
        Constructor[] cons = pClass3.getConstructors();
        for(Constructor c : cons){
            System.out.println(c);
        }
        System.out.println("Field-------------");
        Field[] fields = pClass3.getFields();
        for(Field f : fields){
            System.out.println(f);
        }
        System.out.println("Method-----------");
        Method[] methods = pClass3.getMethods();
        for(Method m : methods){
            System.out.println(m);
        }
    }
}
