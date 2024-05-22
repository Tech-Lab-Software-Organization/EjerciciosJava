import java.util.Scanner;

public class nivel1 {
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public nivel1()
    {
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[2];
        animales[0] = "perro";
        animales[1] = "gato";
    }

    private void puntajePerro()
    {
        if(respuesta.equals(animales[0]))
        {
            System.out.println("Correcto haz ganado 10 puntos");
            puntaje +=10;
        }
        else{
            System.out.println("Incorrecto La respuesta es: " + animales[0]);
            System.out.println("Has perdido 5 punto");
            puntaje -=5;
        }
    }

    private void puntajegato()
    {
        if(respuesta.equals(animales[1]))
        {
            System.out.println("Correcto haz ganado 10 puntos");
            puntaje +=10;
        }
        else{
            System.out.println("Incorrecto La respuesta es: " + animales[1]);
            System.out.println("Has perdido 5 punto");
            puntaje -=5;
        }
    }

    public void imprimePregunta()
    {
        System.out.println("Es un animal que labra y come croquetas");
        respuesta = ent.nextLine();
        puntajePerro();
        System.out.println("Es un animal que maulla y toma leche");
        respuesta = ent.nextLine();
        puntajegato();
    }
}
