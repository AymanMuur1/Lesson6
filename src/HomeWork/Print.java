package HomeWork;

public class Print {
    public static void main(String[] args) {

        System.out.println("КИСА");
        Cat cat = new Cat("Мурзик", "Котик пробежал 100 метров!");
        cat.info();
        cat.scare();
        cat.swim();


        System.out.println("СОБАЧКА");
        Dog dog = new Dog("Пупсик", "Пёсель пробежал 300 метров!");
        dog.info();
        dog.scare();
        dog.swim();
    }
}
