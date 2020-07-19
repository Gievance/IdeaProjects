package com.反射;
import com.forClass.Student;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class 练习3之成员方法 {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException, NoSuchFieldException {
        Class<?> c = Student.class;
        Constructor<?> con = c.getConstructor();
        Object o = con.newInstance();
        Object o1 = con.newInstance();

        Field name = c.getField("name");
        Field age = c.getDeclaredField("age");
        Field area = c.getDeclaredField("area");
        age.setAccessible(true);
        area.setAccessible(true);
        Method showName = c.getMethod("show", String.class, int.class, String.class);


        Object invoke = showName.invoke(o, "黑爾", 12, "西安");
        Student s = (Student)invoke;
//        私有方法要设置setAccessible()
        name.set(o1,"秀儿");
        age.set(o1,12);
        area.set(o1,"北京");
        System.out.println(o1);

    }
}
