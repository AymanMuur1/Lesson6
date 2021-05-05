package HomeWork;

public class Cat extends Animal{
    public Cat(String name, String length ) {super(name, length); }


    public void scare() { System.out.println("Кот " + name + " может пробежать " + " 200 метров" );}
    public void swim() {System.out.println("Кот " + name + " не умеет плавать!");}


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", length='" + length + '\'' +
                '}';
    }
}
