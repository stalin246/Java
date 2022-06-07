import java.util.Scanner;

public class login {
    private static String nombreUsuario;
    private static String contraseniaUsuario;
    public static void login () {
        nombreUsuario = "usu";
        contraseniaUsuario = "1234";
        int x = 0;
        int y = 0;
        do {


            Scanner in = new Scanner(System.in);
            System.out.println("   ╔═════════════════════════╗     ");
            System.out.println("           \uD83D\uDE97Bienvenido\uD83D\uDE97        ");
            System.out.println("   ╚═════════════════════════╝ ");
            System.out.print("Ingresa tu nombre:");
            String nombre = in.next();
            Scanner in1 = new Scanner(System.in);
            System.out.print("Ingresa tu clave:");
            String contrasenia = in1.next();
            if (nombre.equals(nombreUsuario) && contrasenia.equals(contraseniaUsuario)) {
                y = 1;
            } else {
                System.out.println("____________________________");
                System.out.println("\nUsuario no valido y/o clave");
                x++;
            }


        } while (x < 3 && y == 0);
        if (y == 1) {
            System.out.println("\nGracias por iniciar secion");
            Viajes vn = new Viajes();
            int op;
            do {
                Scanner sc = new Scanner(System.in);

                System.out.println("╔════════════════════════════════╗");
                System.out.println(" \uD83D\uDC4B  Bienvenido a Viaje Seguro  ");
                System.out.println(" 1. Realizar un viaje \uD83E\uDDF3         ");
                System.out.println(" 2. Buscar una factura \uD83D\uDCDC        ");
                System.out.println(" 3. Resumen de viajes  \uD83D\uDD1A        ");
                System.out.println(" 4. Vista a los tipos de autos\uD83D\uDE97 ");
                System.out.println(" 5. Salir ➡️                  ");
                System.out.println("╚════════════════════════════════╝");
                System.out.print("Escoge una opcion:");
                op = sc.nextInt();
                switch (op) {
                    case 1:
                        vn.Viaje();
                        break;
                    case 2:


                        System.out.println(  vn.buscarValor());

                      //  vn.buscarValor();
                        break;
                    case 3:
                        vn.presentar();
                        break;
                    case 4:
                        System.out.println(" ___________________________________________________ ");
                        System.out.println("|                                                   |");
                        System.out.println("| ESTOS SON LOS TIPOS DE AUTOS QUE PODEMOS OFRECERTE|");
                        System.out.println("|___________________________________________________|\n");

                        System.out.println(" --------------------------------------------------- ");
                        System.out.println("|                                                   |");
                        System.out.println("---------------♔ AUTO PREMIUM ♔--------------------");
                        autoPremium a1=new autoPremium("ABC","Juan","perez",1,"si","si","si");
                        //a1.toString();
                        System.out.println(a1.toString());
                        System.out.println("---------------♖ AUTO EXPRESS ♖--------------------");
                        autoExpress a2=new autoExpress("EA889","Maria","Jacome",2,"si","si","no");
                        System.out.println(a2.toString());
                        System.out.println("----------------♙ AUTO NORMAL ♙---------------------");
                        autoNormal a3=new autoNormal("TJO987","Martin","Salazar",3,"no","no","no");
                        System.out.println(a3.toString());
                        System.out.println("|                                                   |");
                        System.out.println(" --------------------------------------------------- ");
                        break;
                    default:
                        System.out.println("Esa opcion no existe");
                        break;
                }
            }while(op!=5);
        }
        else{
            System.out.println("\nIntentos maximos superados");

        }
    }
}
