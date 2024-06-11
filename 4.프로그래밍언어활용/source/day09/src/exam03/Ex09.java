package exam03;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Ex09 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class cls1 = Class.forName("exam03.Person");
        Field[] fields = cls1.getFields();
        Method[] methods = cls1.getMethods();
        Constructor[] constructors = cls1.getConstructors();

        System.out.println("----- Fields -----");
        for(Field field : fields) {
            System.out.println(field);
        }
        System.out.println("----- Constructors -----");
        for(Constructor constructor : constructors) {
            System.out.println(constructor);
        }
        System.out.println("------ Methods -------");
        for(Method method : methods) {
            System.out.println(method);
        }

    }
}
