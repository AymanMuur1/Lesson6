package HomeWork;

import static java.awt.SystemColor.info;

public abstract class Animal {
   protected final String name;
   protected final String length;


    public Animal(String name, String length) {this.name = name; this.length = length;}
    public abstract void scare ();
    public abstract void swim ();
    public void info(){System.out.println(this.toString());}

 @Override
 public String toString() {
  return "Animal{" +
          "name='" + name + '\'' +
          ", length='" + length + '\'' +
          '}';
 }

 public String getName() {return name;}
    public String getLength() {return length;}
}
