package src.refectdemo;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Parameter;

public class RefectMethodTest {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
    // 获取 class 字节码文件对象
    Class clazz = Class.forName("src.refectdemo.Student");
    
    // 获取构造方法
    // Constructor[] cons = clazz.getConstructors();
    // for (Constructor con : cons) {
    //   System.out.println(con);
    // }

    // Constructor[] cons2 = clazz.getDeclaredConstructors();
    // for (Constructor con : cons2) {
    //   System.out.println(con);
    // }

    Constructor con1 = clazz.getDeclaredConstructor();
    // System.out.println(con1);

    Constructor con2 = clazz.getDeclaredConstructor(String.class, int.class, int.class);
    // System.out.println(con2);

    Constructor con3 = clazz.getDeclaredConstructor(String.class);
    // System.out.println(con3);

    Constructor con4 = clazz.getDeclaredConstructor(String.class, int.class);
    // System.out.println(con4);


    int modifiers = con4.getModifiers();
    // System.out.println(modifiers);

    Parameter[] parameter = con4.getParameters();
    // for (Parameter p : parameter) {
    //   System.out.println(p);
    // }

    // 暴力反射: 表示临时取消权限校验
    con4.setAccessible(true);
    Student stu = (Student) con4.newInstance("张三", 18); // 设置获取会报错, 因为修饰是 private, 可以通过 setAccessible 临时改变权限
    System.out.println(stu);
  }
}
