package clase2bobjetos;

import models.Moneda;
import static models.Moneda.actualizarMoneda;
import static models.Moneda.borrarMoneda;
import static models.Moneda.llenarMonedas;
import static models.Moneda.monedas;
import java.util.Scanner;

public class Clase2BObjetos {
    static Scanner entradaDato = new Scanner(System.in);
    static int opcion;
    
     public static void agregarMoneda(){
        System.out.println("Ingrese los datos de la Nueva Moneda ");
        System.out.print("Id     : ");
        int monedaId = entradaDato.nextInt();
        System.out.print("Nombre : ");
        String monedaNombre = entradaDato.next();
        System.out.print("Simbolo: ");
        String monedaSimbolo = entradaDato.next();
        System.out.print("Valor  : ");
        Double monedaValor = entradaDato.nextDouble();
        monedas.add(new Moneda(monedaId, monedaNombre, monedaSimbolo, monedaValor));
    }
   

     public static void leerRegistroBorrar(){
        System.out.println("Ingrese el Número de Registro de la Moneda a eliminar ");
        System.out.print("Número de Registro : ");
        int monedaId = entradaDato.nextInt();
        borrarMoneda(monedaId);
    }


    public static void leerRegistroActualizar(){
        System.out.println("Ingrese el Número de Registro de la Moneda a Actualizar ");
        System.out.print("Número de Registro : ");
        int recNo = entradaDato.nextInt();

        System.out.print("Id     : ");
        int monedaId = entradaDato.nextInt();
        System.out.print("Nombre : ");
        String monedaNombre = entradaDato.next();
        System.out.print("Simbolo: ");
        String monedaSimbolo = entradaDato.next();
        System.out.print("Valor  : ");
        Double monedaValor = entradaDato.nextDouble();
        actualizarMoneda(recNo, monedaId, monedaNombre, monedaSimbolo, monedaValor);
    }
    
    
    public static void menuOpciones(int opcionSeleccionada){
        switch(opcionSeleccionada){
            case 1 : agregarMoneda(); break;
            case 2 : System.out.println(monedas.toString()); break;
            case 3 : leerRegistroActualizar(); break;
            case 4 : leerRegistroBorrar(); break;
            case 9 : System.out.println("Adios ..."); break;
            default : System.out.println("Opcion no valida "); break;
        }
    } 
    
    
    public static int menu(){
        System.out.println("1.- Crear Moneda ");
        System.out.println("2.- Listar Monedas ");
        System.out.println("3.- Actualizar Moneda ");
        System.out.println("4.- Borrar Moneda ");
        System.out.println("9.- Salir ... ");
        opcion = entradaDato.nextInt();
        menuOpciones(opcion);
        return opcion;
    }
    
    public static void main(String[] args) {
        int opcionMenu;
        llenarMonedas();
        do{
            opcionMenu = menu();
            
        }while (opcionMenu != 9);
        
    }    
}
