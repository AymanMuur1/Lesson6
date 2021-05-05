package Lesson;

public class Test62 {

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik", "White",3);
        Animal dog = new Dog("Barbos", "Black", 6, "Ovcharka");


       /* Lesson.Cat cat2 = (Lesson.Cat) cat;
        cat2.sleep();*/
        ((Cat) cat).sleep();

       // boolean res = cat instanceof Lesson.Cat;//является ли переменная кэт типом кэт?
        System.out.println(cat instanceof Cat);
        System.out.println(cat instanceof Dog);
        System.out.println(cat instanceof Animal);

        sayVoic(cat);
        sayVoic(dog);

        Animal[] animals = {cat, dog};
                for (Animal animal: animals ){
                    System.out.println(animal);
                }



    }

    private static void sayVoic(Animal animal) {
        animal.voice();

    }
}
