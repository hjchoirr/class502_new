package exam03;

public class Ex02 {
    public static void main(String[] args) {
        Animal[] animals = { new Human(), new Bird(), new Tiger() };
        // 위 한줄과 동일
        //Animal[] animals = new Animal[3];
        //animals[0] = human;
        //animals[1] = tiger;
        //animals[2] = bird;

        for(Animal animal: animals) {
            animal.move();

            if(animal instanceof Human) {
                Human human = (Human) animal;
                human.reading();
            } else if(animal instanceof Tiger) {
                Tiger tiger = (Tiger)  animal;
                tiger.hunting();
            }
        }
    }
}
