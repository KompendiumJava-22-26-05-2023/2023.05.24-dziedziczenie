package pl.comarch.szkolenia.dziedziczenie;

public class Pet extends Mammal {
    private String name;
    private String race;
    private int age;

    public Pet(int x) {
        //???
        //??
    }

    public void walk() {
        System.out.println("Ide na czterech lapach !!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
