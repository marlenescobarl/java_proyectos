import java.util.Scanner;
public class Ejerciciodos
{
    public static void main(String[] args)
    {
        Scanner opcion = new Scanner(System.in);
        //declaracion de variables
        int op = 6, tamano = 0, desde = 0, hasta = 0;
        String sub = "", cadena = "", palabra1 ="", palabra2 = "";
        boolean salir = false;

        while (!salir)
        {
            System.out.println("__________________________________");
            System.out.println("");
            System.out.println("|------------------------|");
            System.out.println("|   Elija una opcion     |");
            System.out.println("|________________________|");
            System.out.println("");
            System.out.println("1. Mostrar el tamanno de la cadena");
            System.out.println("2. Mostrar una subcadena");
            System.out.println("3. Comparacion de palabras");
            System.out.println("4. Comparacion de tamanno");
            System.out.println("5. Salir");
            op = opcion.nextInt();

            //menu
            switch (op)
            {
                case 1:
                    System.out.println("Ingrese una cadena de texto");
                    Scanner texto = new Scanner(System.in);
                    cadena = texto.nextLine();
                    tamano = cadena.length();
                    System.out.println("");
                    System.out.println("El tamaño de la cadena es: " + tamano);
                    break;
                case 2:
                    String cadena_dos = "";
                    System.out.println("Ingrese una cadena de texto " );
                    Scanner cad_s = new Scanner(System.in);
                    cadena_dos = cad_s.nextLine();
                    System.out.print("Desde donde desea optener la nueva cadena: ");
                    Scanner des = new Scanner(System.in);
                    desde = des.nextInt();
                    System.out.print("Hasta donde desea optener la nueva cadena: ");
                    Scanner has = new Scanner(System.in);
                    hasta = has.nextInt();
                    System.out.println("");
                    if(hasta <= tamano)
                    {
                        sub = cadena_dos.substring(desde,hasta);
                        System.out.print("La nueva subcadena es: " + sub);
                        System.out.println("");

                    }else if (hasta < desde)
                    {
                        System.out.println("ERROR de ingreso de datos");

                    } else {
                        System.out.println("El dato ingresado exede el tamanno de la cadena");
                    }

                    break;
                case 3:
                    int ignorar = 2;
                    System.out.println("Ingrese la primera palabra");
                    Scanner pri = new Scanner(System.in);
                    palabra1 = pri.nextLine();
                    System.out.println("Ingrese la segunda palabra");
                    Scanner seg = new Scanner(System.in);
                    palabra2 = seg.nextLine();
                    System.out.println("");
                    System.out.println("Desea ignorar mayusculas");
                    System.out.println("1. SI");
                    System.out.println("2. NO");
                    Scanner ignor = new Scanner(System.in);
                    ignorar = ignor.nextInt();

                    /*creacion de un switch case para observar su funcionamiento
                    en comparacion de una condicion if
                     */
                    switch (ignorar)
                    {
                        case 1:
                            if(palabra1.equals(palabra2))
                            {
                                System.out.println("Las palabras ingresadas son iguales");
                            } else {
                                System.out.println("las palabras ingresadas son diferentes");
                            }
                            break;
                        case 2:
                            if(palabra1.equalsIgnoreCase(palabra2))
                            {
                                System.out.println("Las palabras ingresadas son iguales");
                            } else {
                                System.out.println("las palabras ingresadas son diferentes");
                            }

                            break;
                        default:
                            System.out.println("Debe ingresar 1 para SI y 2 para NO");
                            break;
                    }
                    break;
                case 4:
                    System.out.println("Ingrese una frase");
                    Scanner fras = new Scanner(System.in);
                    String frase = fras.nextLine();
                    System.out.println("Desea ignorar espacios SI (1) NO (2)");
                    Scanner espace = new Scanner(System.in);
                    int espacios = espace.nextInt();

                    /*

                    if(espacios == 1)
                    {
                        int tamano_frase = frase.length();
                        System.out.println("Frase: " + frase + " tamanno: " + tamano_frase);
                    }else {
                        System.out.println("Debe ingresar 1 para SI y 2 para NO");
                    }
                    if(espacios == 2)
                    {
                        //para ignorar los espacios se tiene que trabajar con la misma variable
                        //haciendo uso de las expresiones regulares

                        frase = frase.replaceAll("\\s","");
                        System.out.println("Frase: " + frase + " tamanno: " + frase.length());
                    }else {
                        System.out.println("Debe ingresar 1 para SI y 2 para NO");
                    }
                    */
                    break;
                case 5:
                    salir = true;
                    break;
                default:
                    System.out.println("La opcion igresada no es valida");
                    break;

            }

        }

    }
}
