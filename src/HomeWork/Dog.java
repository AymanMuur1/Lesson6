package HomeWork;

public class Dog extends Animal {
    public Dog(String name, String length) {super(name,length); }


    public void scare() {System.out.println("Пёсель " + name + " может пробежать " + " 500 метров" );}
    public void swim() {System.out.println("Пёсель " + name + " может проплыть " + " 10 метров");}


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
