import java.util.Scanner;
public class Ejerciciodos
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        //declaracion de variables
        int op = 6;
        String sub = "";
        boolean salir = false;



        while (!salir)
        {
            System.out.println("    Elija una opcion");
            System.out.println("");
            System.out.println("1. Mostrar el tamanno de la cadena");
            System.out.println("2. Mostrar una subcadena");
            System.out.println("3. Comparacion de palabras");
            System.out.println("4. Comparacion de tamanno");
            op = entrada.nextInt();

            //menu
            switch (op)
            {
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                default:
                    break;

            }

        }




    }
}
