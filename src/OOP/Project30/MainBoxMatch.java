package OOP.Project30;

public class MainBoxMatch {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Khabib", 15, 90, 100, 85);
        Fighter f2 = new Fighter("Connor", 25, 90, 100, 70);

        Ring match1 = new Ring(f1, f2, 80, 100);
        match1.run();
    }
}
