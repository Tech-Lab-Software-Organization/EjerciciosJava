public class App {
    public static void main(String[] args) throws Exception {
        nivel1 obj = new nivel1();
        obj.imprimePregunta();

        System.out.println("--------Marcador-------");
        System.out.println("Nivel 1");
        System.out.println("");

        System.out.println("nivel 2");

        nivel2 obj2 = new nivel2();

        obj2.imprimePregunta();

        System.out.println("Tu puntaje es: " + obj.puntaje);
    }
}
