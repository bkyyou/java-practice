package src.refectdemo;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

public class RefectMethodTest03 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    Class clazz = Class.forName("src.refectdemo.Student");

    // 返回所有公共成员方法对象, 包括父类所有公共方法
    Method[] methods = clazz.getMethods();
    for (Method m : methods) {
      // System.out.println(m);
    }

    Method[] methods2 = clazz.getDeclaredMethods();
    for (Method m : methods2) {
      // System.out.println(m);
    }

    // 获取指定的单一方法
    Method sleepMethod = clazz.getMethod("sleep");
    // System.out.println(sleepMethod);
    Method eatMethod = clazz.getDeclaredMethod("eat", String.class);
    // System.out.println(eatMethod);

    // 获取方法修饰符
    int modifiers = eatMethod.getModifiers();
    // System.out.println(modifiers);

    // 获取方法的名字
    String name = eatMethod.getName();
    // System.out.println(name);

    // 获取方法的形参
    Parameter[] parameters = eatMethod.getParameters();
    for(Parameter p: parameters) {
      // System.out.println(p);
    }

    // 获取方法的异常
    Class[] exceptionType = eatMethod.getExceptionTypes();
    for (Class e : exceptionType) {
      // System.out.println(e);
    }

    Student s = new Student("张三", 18, 1);
    eatMethod.setAccessible(true);
    eatMethod.invoke(s, "鸡腿");

    Method runMethod = clazz.getDeclaredMethod("run", String.class);
    runMethod.setAccessible(true);
    // Object res = runMethod.invoke(s, "10000");
    String res = (String) runMethod.invoke(s, "10000");
    // System.out.println(res);

    saveObj(s);
  }

  // 把对象里面所有的成员变量和值保存在本地中
  public static void saveObj(Object obj) throws IllegalArgumentException, IllegalAccessException {
    // 获取字节码文件对象
    Class clazz = obj.getClass();

    // 获取所有成员方法
    Field[] fields = clazz.getDeclaredFields();
    for (Field f : fields) {
      f.setAccessible(true);
      // 获取成员变量名字
      String name = f.getName();
      // 获取成员变量的值
      Object value = f.get(obj);
      System.out.println(name + ":" + value);
    }
  }
}
