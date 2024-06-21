package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.time.LocalDateTime;

public class Ex01 {
    public static void main(String[] args) throws Exception{
        Class clazz = Member.class;

        Constructor constructor = clazz.getDeclaredConstructors()[0];

        Object obj = constructor.newInstance();

        Method[] methods = clazz.getDeclaredMethods();
        Class clz;
        for(Method method : methods) {
            String name = method.getName();
            System.out.println(name);
            if(!name.startsWith("set")) {
                //continue;

                clz = method.getParameterTypes()[0];
                System.out.println(method.getParameterTypes()[0]);
                Object arg = null;
                if (clz == String.class) {
                    System.out.println("1---");
                    arg = "문자열";
                } else if (clz == LocalDateTime.class) {
                    System.out.println("1---");

                    arg = LocalDateTime.now();

                }
                method.invoke(obj, arg);
            }
        }

    }
}
