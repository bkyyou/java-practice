package src.clonedemo1;

import java.util.Arrays;

public class User implements Cloneable {
  private String name;
  private int age;
  private String password;
  private int[] gameProgress;
  
  public User() {
  }
  
  public User(String name, int age, String password, int[] gameProgress) {
    this.name = name;
    this.age = age;
    this.password = password;
    this.gameProgress = gameProgress;
  }

  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getAge() {
    return age;
  }
  public void setAge(int age) {
    this.age = age;
  }
  public String getPassword() {
    return password;
  }
  public void setPassword(String password) {
    this.password = password;
  }
  public int[] getGameProgress() {
    return gameProgress;
  }
  public void setGameProgress(int[] gameProgress) {
    this.gameProgress = gameProgress;
  }
  
  @Override
  public String toString() {
    return "User [name=" + name + ", age=" + age + ", password=" + password + ", gameProgress="
        + Arrays.toString(gameProgress) + "]";
  }

  // @Override
  // protected Object clone() throws CloneNotSupportedException {
  //   // 调用父类中的 clone 方法
  //   // 相当于让 Java 帮我们克隆一个对象， 并把克隆之后的对象返回
  //   return super.clone();
  // }
  @Override
  protected Object clone() throws CloneNotSupportedException {
    // 调用父类中的 clone 方法
    // 相当于让 Java 帮我们克隆一个对象， 并把克隆之后的对象返回
    // return super.clone();

    int[] _gameProgress = this.gameProgress;
    int[] newGameProgress = new int[_gameProgress.length];
    for (int i = 0; i < _gameProgress.length; i++) {
      newGameProgress[i] = _gameProgress[i];
    }

    User u = (User) super.clone();
    u.gameProgress = newGameProgress;

    return u;
  }
  
}
