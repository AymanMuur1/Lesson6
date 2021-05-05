package Lesson;

public class Cat extends Animal {

    public Cat(String name, String color, int age) {
        super(name, color, age);
    }
    public void play(){
        System.out.println("Our cat is playing!");
    }
    public void sleep(){
        System.out.println("Zzzz......Zzzz......");
    }

    @Override
    public void voice() {
        System.out.println("Meow!");
    }

    @Override
    public String toString() {
        return "Lesson.Cat{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}


