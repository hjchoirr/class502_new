package exam03;

import java.util.Arrays;

public class Ex01 {
    public static void main(String[] args) {

        Human human = new Human();
        //human.move();

        Tiger tiger = new Tiger();
        //tiger.move();

        Bird bird = new Bird();
        //bird.move();

        Animal[] animals = new Animal[3];

        animals[0] = human;
        animals[1] = tiger;
        animals[2] = bird;


        /*for(int i = 0; i < animals.length; i++) {
            animals[i].move();
        }*/
        for(Animal animal : animals) {
            animal.move();
        }
    }
}
