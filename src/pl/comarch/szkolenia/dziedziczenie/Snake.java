package pl.comarch.szkolenia.dziedziczenie;

public class Snake extends Pet {

    public Snake() {
        super(5);
    }

    @Override
    public void walk() {
        System.out.println("Pelzam !!!");
    }

    public void sycz() {
        System.out.println("sssssssssssssssss");
    }

    @Override
    public String toString() {
        return super.toString() + " Snake - " + this.getName() + " " + this.getRace();
    }
}
