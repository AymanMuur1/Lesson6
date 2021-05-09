package Lesson7;

public class Cat1 {
        private String name;
        private int appetit;

        public Cat1(String name, int appetit) {
            this.name = name;
            this.appetit = appetit;
        }
        public void eat(Plate p){
            System.out.println("Кот начал есть");
            p.decreaseFood(appetit);

        }
    }

