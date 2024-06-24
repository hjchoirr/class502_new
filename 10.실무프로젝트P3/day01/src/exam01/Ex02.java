package exam01;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class Ex02 {
    public static void main(String[] args) throws NoSuchFieldException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class clazz = Member.class;
        Constructor constructor = clazz.getDeclaredConstructors()[0];
        Object obj = constructor.newInstance();

        Field field = clazz.getDeclaredField("str");
        field.setAccessible(true);
        System.out.println("str Field : " + field);
        field.set(obj, "DEF");

        Member member = (Member)obj;
        System.out.println("member.str : " + member.str);

    }
}
