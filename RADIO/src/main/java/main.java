/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* Universidad del Valle
Maria Jose Morales 19145
Maria Isabel Montoya 19169
Hoja de Trabajo 1
Algoritmos y Estructura de Datos
Clase: Main
*/
import.util.Scanner;
public class main {
    public static void main(String[]args){
        int w = 0;
        radio miRadio = new radio(); 
        Scanner scan = new Scanner (System.in);
        System.out.println("Bienvenido a su radio"+miRadio.estacionActual());
        while(w!=2){
            System.out.println("Opciones: \n 1. Encender \n 2. Cambiar de AM a FM a AM \n 3. Avanzar en dial \n 4. Guardar Emisora \n 5. Seleccionar emisora \n 6. Apagar");
            System.out.println("Ingrese su opcion:");
            int op = scan.nextInt();
            if (op==1){
                miRadio.onOff();
                miRadio.estacionActual();
            }
            else if (op==2){
                miRadio.cambiarFrecuencia();
                miRadio.estacionActual();                
            }
            else if (op==3){
                miRadio.avanzar();
                miRadio.estacionActual();                
            }
            else if (op==4){
                System.out.println("En que numero (de 1 a 12)desea guardar la emisora actual?");
                int boton = scan.nextInt();
                miRadio.guardar(boton);
                System.out.println("Su estación ha sido guardada");
            }
            else if (op==5){
                System.out.println("Que numero de emisora desea escuchar (de 1 a 12)");
                int boton = scan.nextInt();
                if((boton<1) && (boton>12)){
                    System.out.println("El valor ingresado es invalido");
                }
                else{
                    miRadio.seleccionarEmisora(boton);
                    miRadio.estacionActual();
                }
            }
            else if (op==6){
                miRadio.onOff();
                miRadio.estacionActual();
            }  
            System.out.println("Desea regresar al menu de opciones o salir?\n 1. Regresar \n 2. Salir\n Ingresar en numeros su eleccion:");
            w=scan.nextInt();
        }
        System.out.println("Que tenga un buen dia y no vaya olvidar su telefono ;)");
    } 
}
