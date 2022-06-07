import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Viajes  {
    double viajeRecorrido = 0;
    Scanner sc = new Scanner(System.in);
    ArrayList<Autos> listConductores = new ArrayList<>();
    autoPremium c1=new autoPremium("AU897","Juan","Perez",1,"si","si","si");
    autoExpress c2=new autoExpress("EA889","Maria","Jacome",2,"si","si","no");
    autoNormal c3=new autoNormal("TJO987","Martin","Salazar",3,"no","no","no");
    ArrayList<Resumen> listaresumen = new ArrayList<>();



    public void Viaje(){
        int op1;
        String lugar ;
        double km;
        String fecha;


        System.out.println("¿Qué viaje vas a realizar?:");
        System.out.print("Ingrese la fecha de hoy:");
        fecha= sc.next();
        System.out.print("¿A que lugar vas?:");
        lugar = sc.next();
        System.out.print("Ingrese los km considerados:");
        km=sc.nextInt();

                //---------------------------------------------------------
        System.out.println("╔══════════════════════════════════════╗");
        System.out.println("  ---¿Qué tipo de servicio requieres?--");
        System.out.println("  1. Premiun ♔                       ");
        System.out.println("  2. Express ♖                       ");
        System.out.println("  3. Normal  ♙                                 ");
        System.out.println("╚══════════════════════════════════════╝");

        System.out.println("Escoje tu opcion: ");
        op1 = sc.nextInt();
        switch (op1){
            case 1:
                viajeRecorrido=km*0.5;
                double d = Math.round(viajeRecorrido*100.0)/100.0;
                System.out.println("En unos minutos tu transporte llegara por ti");
                System.out.println("El auto Premium "+"\nPlacas: "+c1.getMatricula()+"\nConductor: "+c1.getNombreConductor()+" "+c1.getApellidoCodnuctor()+c1.getAire());
                //----------------------------------------------------------
                System.out.println("Estas viajando a "+lugar);
                for(int i = 0; i < 10; ++i) {
                    System.out.print(" \uD83D\uDE97");
                }
                System.out.println("......");
                System.out.println("\n Gracias por elegirnos para tu viaje");
                System.out.println("Total del viaje: "+d+ "$");

                //----------------------------------------------------------------------------------------
                System.out.println("╔══════════════════════════════════════════════════╗");
                System.out.println("║                                                  ║");
                System.out.println(" ----------------Resumen de tu viaje---------------");
                System.out.println("Fecha: "+fecha);
                System.out.println("Viaje: Tu ubicacion------->"+lugar);
                System.out.println("Fuiste atendido por: ");
                listaresumen.add(new Resumen(fecha,lugar,c1.getNombreConductor(), c1.getApellidoCodnuctor(),c1.getMatricula(),d,1,"si","si","si"));
                System.out.println("El auto Premium "+"\nPlacas: "+c1.getMatricula()+"\nConductor: "+c1.getNombreConductor()+" "+c1.getApellidoCodnuctor()+"\nTu pago es: "+d+" $");
                System.out.println("║                                                  ║");
                System.out.println("╚══════════════════════════════════════════════════╝");
                break;
            case 2:
                viajeRecorrido=km*0.3;
                double e = Math.round(viajeRecorrido*100.0)/100.0;
                System.out.println("En unos minutos tu transporte llegara por ti");
                System.out.println("El auto Express "+"\nPlacas: "+c2.getMatricula()+"\nConductor: "+c2.getNombreConductor()+" "+c2.getApellidoCodnuctor());
                //----------------------------------------------------------
                System.out.println("Estas viajando a "+lugar);
                for(int i = 0; i < 10; ++i) {
                    System.out.print(" \uD83D\uDE97");
                }
                System.out.println("......");
                System.out.println("\n Gracias por elegirnos para tu viaje");
                System.out.println("Total del viaje: "+e+ "$");

                //----------------------------------------------------------------------------------------
                System.out.println("╔══════════════════════════════════════════════════╗");
                System.out.println("║                                                  ║");
                System.out.println(" ----------------Resumen de tu viaje---------------");
                System.out.println("Fecha: "+fecha);
                System.out.println("Viaje: Tu ubicacion------->"+lugar);
                System.out.println("Fuiste atendido por: ");
                listaresumen.add(new Resumen(fecha,lugar,c2.getNombreConductor(), c2.getApellidoCodnuctor(),c2.getMatricula(),e,2,"si","si","no"));
                System.out.println("El auto Express "+"\nPlacas: "+c2.getMatricula()+"\nConductor: "+c2.getNombreConductor()+" "+c2.getApellidoCodnuctor()+"\nTu pago es: "+e+" $");
                System.out.println("║                                                  ║");
                System.out.println("╚══════════════════════════════════════════════════╝");
                break;
            case 3:
                viajeRecorrido=km*0.2;
                double f = Math.round(viajeRecorrido*100.0)/100.0;
                System.out.println("En unos minutos tu transporte llegara por ti");
                System.out.println("El auto normal "+"\nPlacas: "+c3.getMatricula()+"\nConductor: "+c3.getNombreConductor()+" "+c3.getApellidoCodnuctor());
                //----------------------------------------------------------
                System.out.println("Estas viajando a "+lugar);
                for(int i = 0; i < 10; ++i) {
                    System.out.print(" \uD83D\uDE97");
                }
                System.out.println("......");
                System.out.println("\n Gracias por elegirnos para tu viaje");
                System.out.println("Total del viaje:"+f+ "$");

                //----------------------------------------------------------------------------------------
                System.out.println("╔══════════════════════════════════════════════════╗");
                System.out.println("║                                                  ║");
                System.out.println(" ----------------Resumen de tu viaje---------------");
                System.out.println("Fecha: "+fecha);
                System.out.println("Viaje: Tu ubicacion------->"+lugar);
                System.out.println("Fuiste atendido por: ");
                listaresumen.add(new Resumen(fecha,lugar,c3.getNombreConductor(), c3.getApellidoCodnuctor(),c3.getMatricula(),f,3,"no","no","no"));
                System.out.println("El auto Premium "+"\nPlacas: "+c3.getMatricula()+"\nConductor: "+c3.getNombreConductor()+" "+c3.getApellidoCodnuctor()+"\nTu pago es: "+f+" $");
                System.out.println("║                                                  ║");
                System.out.println("╚══════════════════════════════════════════════════╝");
                break;
            default:
                System.out.println("No existe esta opcion");
                break;
        }


    }



    public void escribir(String nombreArchivo) {



//Escritura


    }





    public String buscarValor(){


        //ArrayList<Resumen> listaresumen = new ArrayList<>();

        String fecha1="";
        int indice;
        System.out.print("Ingrese la fecha del viaje que esta buscando:");
        fecha1 = sc.next();
        System.out.println(" ___________________________________________________ ");
        System.out.println("|                                                   |");
        System.out.println("|                 FACTURA DEL VIAJE                 | ");
        System.out.println("|___________________________________________________|");
        System.out.println("|                                                   |");
        Resumen resumenAux = new Resumen(fecha1);
        indice = listaresumen.indexOf(resumenAux);
        if(listaresumen.equals(resumenAux)){
            resumenAux = listaresumen.get(indice);
            System.out.println(" "+resumenAux);
        }
        else if (indice!= -1) {
            resumenAux = listaresumen.get(indice);
            System.out.println(resumenAux);

        } else {
            System.out.println("No existe ese resumen");
        }
        System.out.println("|                                                   |");
        System.out.println("|___________________________________________________| ");
        //Archivo a = new Archivo();
        //a.creartxt("factura.txt","hola mirame");
        Archivo b = new Archivo();
        b.creartxt("factura.txt","__________________________\n"+"     FACTURA DEL VIAJE    \n"+"__________________________\n"+resumenAux+"\n__________________________\n");
        return fecha1;

    }

    public void presentar(){
        if(listaresumen.size()>0){
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("║                                                  ║");
            System.out.println(" ----------------Resumenes de tu viaje------------- ");
            for (Resumen resumen: listaresumen ) {
                System.out.println(resumen);
                System.out.println("-------------------------------------------------- ");

            }
            System.out.println("║                                                  ║");
            System.out.println("╚══════════════════════════════════════════════════╝");
        }else{
            System.out.println("no existe personas registradas");
        }

    }






}
