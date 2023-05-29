package pl.comarch.szkolenia.dziedziczenie;

public class App {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.setAge(10);
        cat.setName("Puszek");
        cat.setRace("Brytyjski");

        System.out.println(cat.getName());
        System.out.println(cat.getRace());
        System.out.println(cat.getAge());
        cat.cos = 234;
        cat.walk();

        Dog dog = new Dog();
        dog.setName("Reksio");
        dog.setRace("Kundel");
        dog.setAge(12);

        System.out.println(dog.getName());
        System.out.println(dog.getRace());
        System.out.println(dog.getAge());
        dog.cos = 345;
        dog.walk();

        Snake snake = new Snake();
        snake.setName("Janusz");
        snake.setRace("Pyton");
        snake.setAge(5);
        System.out.println(snake.getName());
        System.out.println(snake.getRace());
        System.out.println(snake.getAge());
        snake.walk();
        snake.sycz();

        Pet p = new Snake();
        Mammal m = new Dog();

        Pet[] pets = new Pet[5];
        pets[0] = new Snake();
        pets[1] = new Cat();
        pets[2] = new Dog();

        if(p instanceof Snake) {
            Snake s = (Snake) p;
            s.sycz();
        }

        System.out.println(snake);
    }
}
