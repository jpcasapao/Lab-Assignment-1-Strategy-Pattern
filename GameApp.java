public class GameApp {
    public static void main(String[] args) {
        Character knight = new Knight("Sir Lancelot(Knight)");
        Character wizard = new Wizard("Merlin(Mage)");
        Character archer  = new Archer("Legolas(Archer)");

        knight.attack();
        knight.defend();
        System.out.println();

        wizard.attack();
        wizard.defend();
        System.out.println();

        archer.attack();
        archer.defend();
    }
}