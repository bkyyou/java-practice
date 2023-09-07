package src.exceptiondemo01;

public class NameFormatException extends RuntimeException {
  public static void main(String[] args) {
    // 技巧
    // NameFormat 当前异常的名字, 表示姓名格式化的问题
    // Exception 表示当前类是一个异常类

    // 继承
    // 运行时 RuntimeException 核心: 运行时参数有问题
    // 编译时 Exception 核心: 书写时提醒
    
  }

  public NameFormatException() {
  }

  public NameFormatException(String message) {
    super(message);
  }
  
}
