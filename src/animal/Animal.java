package src.animal;

public class Animal {
  static String category;
  private String name;
  String appetite = "good";
  
  public Animal() {
    // this("name");
  }
  public Animal(String name) {
    // this()
    this.name = name;
  }
  public void show() {
    System.out.println("Animal show");
  }
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public static void test() {

  }
  // @Override
  // public String toString() {
  //   return "Animal [name=" + name + ", appetite=" + appetite + "]";
  // }
  // @Override
  // public int hashCode() {
  //   final int prime = 31;
  //   int result = 1;
  //   result = prime * result + ((name == null) ? 0 : name.hashCode());
  //   result = prime * result + ((appetite == null) ? 0 : appetite.hashCode());
  //   return result;
  // }
  // @Override
  // public boolean equals(Object obj) {
  //   if (this == obj)
  //     return true;
  //   if (obj == null)
  //     return false;
  //   if (getClass() != obj.getClass())
  //     return false;
  //   Animal other = (Animal) obj;
  //   if (name == null) {
  //     if (other.name != null)
  //       return false;
  //   } else if (!name.equals(other.name))
  //     return false;
  //   if (appetite == null) {
  //     if (other.appetite != null)
  //       return false;
  //   } else if (!appetite.equals(other.appetite))
  //     return false;
  //   return true;
  // }
  
}
