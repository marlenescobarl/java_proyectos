import java.util.Scanner;
public class Ejerciciodos
{
    public static void main(String[] args)
    {
        Scanner opcion = new Scanner(System.in);
        //declaracion de variables
        int op = 6, tamano = 0, desde = 0, hasta = 0, noign = 2, ignorar = 1;
        String sub = "", cadena = "", palabra1 ="", palabra2 = "";
        boolean salir = false;

        while (!salir)
        {
            System.out.println("    Elija una opcion");
            System.out.println("");
            System.out.println("1. Mostrar el tamanno de la cadena");
            System.out.println("2. Mostrar una subcadena");
            System.out.println("3. Comparacion de palabras");
            System.out.println("4. Comparacion de tamanno");
            op = opcion.nextInt();

            //menu
            switch (op)
            {
                case 1:
                    System.out.println("Ingrese una cadena de texto");
                    Scanner texto = new Scanner(System.in);
                    cadena = texto.nextLine();
                    tamano = cadena.length();
                    System.out.print("El tamaño de la cadena es: " + tamano);
                    break;
                case 2:
                    System.out.println("Cadena original");
                    System.out.println(cadena);
                    System.out.println("Desde donde desea optener la nueva cadena");
                    Scanner des = new Scanner(System.in);
                    desde = des.nextInt();
                    System.out.println("Hasta donde desea optener la nueva cadena");
                    Scanner has = new Scanner(System.in);
                    hasta = has.nextInt();
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
                    System.out.println("Ingrese la primera palabra");
                    Scanner pri = new Scanner(System.in);
                    palabra1 = pri.nextLine();
                    System.out.println("Ingrese la segunda palabra");
                    Scanner seg = new Scanner(System.in);
                    palabra2 = seg.nextLine();

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
