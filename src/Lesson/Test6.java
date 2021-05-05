package Lesson;

public class Test6 {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Barsik", "White",3);
        Cat cat2 = new Cat("Barsik", "White",3);
        Cat cat3 = cat1;



        System.out.println("cat1 == cat2: " + (cat1 == cat2));
        System.out.println("cat1.equals(cat2): " + (cat1.equals(cat2)));
        System.out.println("cat1 == cat3: " + (cat1 == cat3));
        System.out.println("cat1.equals(cat3): " + (cat1.equals(cat3)));


       /* Lesson.Animal animal = new Lesson.Animal("smth", "red", 555);

        System.out.println("----Lesson.Animal section----");
        animal.printInfo();*/


        System.out.println("----Lesson.Cat section----");
        cat1.printInfo();
        cat1.sleep();
        cat1.play();
        cat1.voice();


        Dog dog = new Dog("Barbos", "Black", 6, "Ovcharka");
        System.out.println("----Lesson.Dog section----");
        dog.printInfo();
        dog.voice();
        System.out.println(dog.getType());
    }
}
