package src.refectdemo;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
  // 方法的作用, 给明星的对象创造一个代理
  // 形参: 被代理的明星对象
  // 返回值: 给明星创建代理
  public static Star createProxy(BigStar bigStar) {
    /**
     * 参数一: 用于指定用哪个类加载器, 去加载生成的代理类 (去加载第二个参数类)
     * 参数二: 指定接口, 这些接口用于指定的生成代理有哪些方法
     * 参数三: 用来指定生成的代理对象要干什么事情
     */
    Star star = (Star) Proxy.newProxyInstance(ProxyUtil.class.getClassLoader(), new Class[]{Star.class}, new InvocationHandler() {
        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
          /**
           * 参数一: 代理的方法
           * 参数二: 要运行的方法 sing
           * 参数三: 调用 sing 方法时, 传递的参数
           */
          if ("sing".equals(method.getName())) {
            System.out.println("准备话筒");
          } else if ("dance".equals(method.getName())) {
            System.out.println("准备场地");
          }
          return method.invoke(bigStar, args);
        }
      }
    );
    return star;
  }
}
