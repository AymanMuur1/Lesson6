package Lesson7;

public class Cat {
    private String name;
    private int appetit;

    public Cat(String name, int appetit) {
        this.name = name;
        this.appetit = appetit;
    }
    public void eat(Plate p){
        System.out.println("Кот начал есть");
        p.decreaseFood(appetit);

    }
}
