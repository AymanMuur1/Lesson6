package Lesson;

public class Dog extends Animal{

    private final String type;

    public Dog(String name, String color, int age, String type){
        super(name, color, age);
        this.type = type;
    }
    public String getType() {
        return type;
    }

    @Override
    public void voice() {
        System.out.println("Bark!");
    }

    @Override
    public String toString() {
        return "Lesson.Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", type='" + type + '\'' +
                '}';
    }
}

