import java.util.Scanner;

public class nivel2 {
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public nivel2() {
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[7];
        animales[4] = "elefante";
        animales[5] = "tigre";
        animales[3] = "hormiga";
        animales[6] = "mosca";

    }

    public void imprimePregunta() {
        System.out.println("Es un animal grande que tiene una trompa");
        respuesta = ent.nextLine();
        puntajeElefante();

        System.out.println("Es un felino de franjas negras y naranjas");
        respuesta = ent.nextLine();
        pregunta3();
        System.out.println("Es un animal pequeño");
        respuesta = ent.nextLine();
        hormiga();
        System.out.println("Es un animal sucio");
        puntajeMosca();

    }

    public void hormiga() {
        if (respuesta.equals(animales[3])) {
            System.out.println("Correcto has ganado una hormiga mas 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("incorrecto la respuesta es: " + animales[3]);
            System.out.println("has perdido una hormiga y 5 puntos");
            puntaje -= 10;
        }
    }

    public void puntajeMosca() {
        if (respuesta.equals(animales[6])) {
            System.out.println("Correcto has ganado una mosca mas 20 puntos");
            puntaje += 20;
        } else{
            System.out.println("Incorrecto la respuesta es: " + animales[2]);
            System.out.println("Has perdido una mosca y 5 puntos");
            puntaje -= 10;
        }
    }

    public void pregunta3() {
        if (respuesta.equals(animales[5])) {
            System.out.println("Correcto, haz ganado 20 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto. La respuesta es: " + animales[5]);
            System.out.println("Has perdido 10 puntos");
            puntaje -= 10;
        }
    }

    private void puntajeElefante() {
        if (respuesta.equals(animales[4])) {
            System.out.println("Correcto, haz ganado 10 puntos");
            puntaje += 20;
        } else {
            System.out.println("Incorrecto. La respuesta es: " + animales[4]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 10;
        }
    }
}