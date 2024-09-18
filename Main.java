public class Main {
    public static void main(String[] args) {
        System.out.println("Fonction Main");

        Fraction f = new Fraction();
        System.out.println(
                "Test : méthode toString vaut 'Je suis une fraction' : " + f.toString().equals("Je suis une fraction"));

    }
}
