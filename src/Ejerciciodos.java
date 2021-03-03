import java.util.Scanner;
public class Ejerciciodos
{
    public static void main(String[] args)
    {
        Scanner en = new Scanner(System.in);
        //declaracion de variables
        int op = 6, tamano = 0, desde = 0, hasta = 0;
        String sub = "", cadena = "";
        boolean salir = false;

        while (!salir)
        {
            System.out.println("    Elija una opcion");
            System.out.println("");
            System.out.println("1. Mostrar el tamanno de la cadena");
            System.out.println("2. Mostrar una subcadena");
            System.out.println("3. Comparacion de palabras");
            System.out.println("4. Comparacion de tamanno");
            op = en.nextInt();

            //menu
            switch (op)
            {
                case 1:
                    System.out.println("Ingrese una cadena de texto");
                    cadena = en.nextLine();
                    tamano = cadena.length();
                    System.out.print("El tamaño de la cadena es: " + tamano);
                    break;
                case 2:
                    System.out.println("Cadena original");
                    System.out.println(cadena);
                    System.out.println("Desde donde desea optener la nueva cadena");
                    desde = en.nextInt();
                    System.out.println("Hasta donde desea optener la nueva cadena");
                    hasta = en.nextInt();
                    if(hasta <= tamano)
                    {
                        sub = cadena.substring(desde,hasta);
                        System.out.print("La nueva subcadena es: " + sub);
                        System.out.println("");

                    }else {
                        System.out.println("El tamanno no exede el tamanno de la cadena original");
                    }

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
