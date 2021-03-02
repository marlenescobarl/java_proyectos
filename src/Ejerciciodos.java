import java.util.*;
public class Ejerciciodos
{
    public static void main(String[] args)
    {
        Scanner go = new Scanner(System.in);
        //declaracion de variables
        int op = 4, numc = 0;
        String cado = "", sub = "";

        System.out.println("    Que operacion desea");
        System.out.println("");
        System.out.println("1. Mostrar el tamanno de la cadena");
        System.out.println("2. Mostrar una subcadena");
        System.out.println("3. Comparacion de palabras");
        System.out.println("4. Comparacion de tamanno");
        op = go.nextInt();

        //menu principal
        switch (op)
        {
            case 1: System.out.println("Ingrese la cadena de texto");
                    cado = go.nextLine();

                    numc = cado.length();
                    System.out.print("El tamanno de la cadena es: " + numc);
                    break;
            case 2:

        }

    }
}
