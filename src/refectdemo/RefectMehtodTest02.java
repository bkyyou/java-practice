package src.refectdemo;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class RefectMehtodTest02 {
  public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
    Class clazz = Class.forName("src.refectdemo.Student");
    
    // 获取所有成员变量
    Field[] fields = clazz.getDeclaredFields();
    for (Field f : fields) {
      System.out.println(f);
    }

    // 获取单个公共成员变量
    Field test = clazz.getField("test");
    System.out.println(test);

    // 获取单个成员变量  (可以获取私有的)
    Field name = clazz.getDeclaredField("name");
    System.out.println(name);

    // 获取权限修饰符
    int modifier = name.getModifiers();
    System.out.println(modifier);

    // 获取成员变量名
    String n = name.getName();
    System.out.println(n);

    // 获取成员变量类型
    Class<?> type = name.getType();
    System.out.println(type);

    // 获取成员变量的值 (private 需要修改临时权限)
    Student student = new Student("张三", 18, 1);
    name.setAccessible(true);
    // Object value = name.get(student);
    String value = (String) name.get(student);
    System.out.println(value);

    // 修改对象里面记录的值
    name.set(student, "李四");
    System.out.println(student);
  }
  
}
