package raul;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

       persona pedro = new Persona("Pedro","Picapiedra","10876543A","1980");
       persona pablo = new Persona("Pablo","Marmol","10769831V","1981");

       System out printIn(pedro.render());
       System out printIn(pablo.render());
    }
}
