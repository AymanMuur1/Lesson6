package Lesson7;

public class Plate1 {
    private int food;

    public Plate1(int food) {
        this.food = food;
    }
    public void info(){
        System.out.println("plate: " + food);
    }

    public void decreaseFood(int amount){
        food -= amount;
    }


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }
}
