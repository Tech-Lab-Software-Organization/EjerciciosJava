import java.util.Scanner;

public class nivel2 {
    public int puntaje;
    private String respuesta;
    private final String[] animales;
    private final Scanner ent;

    public nivel2() {
        puntaje = 0;
        ent = new Scanner(System.in);
        animales = new String[4];
        animales[4] = "elefante";
      
    }
    
    public void imprimePregunta() {
        System.out.println("Es un animal grande que tiene una trompa");
        respuesta = ent.nextLine();
        puntajeElefante();
        
    }
    
    public void pregunta1 () {
        
    }

    public void pregunta2() {
        
    }

    public void pregunta3() {
        
    }
        
    private void puntajeElefante() {
        if (respuesta.equals(animales[4])) {
            System.out.println("Correcto, haz ganado 10 puntos");
            puntaje += 10;
        } else {
            System.out.println("Incorrecto. La respuesta es: " + animales[4]);
            System.out.println("Has perdido 5 puntos");
            puntaje -= 5;
        }
    }
}

