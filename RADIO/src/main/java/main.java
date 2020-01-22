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
import java.util.Scanner;
public class main {
    public static void main(String[]args){
        int w = 0;
        radio miRadio = new radio(); 
        Scanner scan = new Scanner (System.in);
        System.out.println("\nBienvenido a su radio\n"+miRadio.estacionActual());
        while(w!=2){
            System.out.println("\nOpciones: \n 1. Encender \n 2. Cambiar de AM a FM a AM \n 3. Avanzar en dial \n 4. Guardar Emisora \n 5. Seleccionar emisora \n 6. Apagar");
            System.out.println("Ingrese su opcion:");
            int op = scan.nextInt();
            if (op==1){
                //guarda el estado de la radio
                boolean ea = miRadio.estado();
                //si ya esta encendida da un aviso
                if(ea==true)
                    System.out.println("La radio ya esta encendida.");
                else{
                    miRadio.onOff();
                    System.out.println(miRadio.estacionActual());
                }
            }
            else if (op==2){
                miRadio.cambiarFrecuencia();
                System.out.println(miRadio.estacionActual());                
            }
            else if (op==3){
                miRadio.avanzar();
                System.out.println(miRadio.estacionActual());                
            }
            else if (op==4){
                //pide el boton en el que desea guardar la estacion 
                System.out.println("En que numero (de 1 a 12)desea guardar la emisora actual?");
                int boton = scan.nextInt();
                if((boton<1) && (boton>12)){
                    System.out.println("El valor ingresado es invalido");
                }
                else{
                    miRadio.guardar(boton);
                    System.out.println("Su estacion ha sido guardada");
                }   
            }
            else if (op==5){
                //pide el boton que desea seleccionar para escuchar 
                System.out.println("Que numero de emisora desea escuchar (de 1 a 12)");
                int boton = scan.nextInt();
                if((boton<1) && (boton>12)){
                    System.out.println("El valor ingresado es invalido");
                }
                else{
                    miRadio.seleccionarEmisora(boton);
                    System.out.println(miRadio.estacionActual());
                }
            }
            else if (op==6){
                //guarda el estado de la radio
                boolean ea = miRadio.estado();
                //si la radio ya esta apagada da un aviso 
                if(ea==false)
                    System.out.println("La radio ya esta apagada.");
                else{
                    miRadio.onOff();
                    System.out.println(miRadio.estacionActual());
                }
            }  
            System.out.println("\nDesea regresar al menu de opciones o salir?\n 1. Regresar \n 2. Salir\n Ingresar en numeros su eleccion:");
            w=scan.nextInt();
        }
        System.out.println("Que tenga un buen dia y no vaya olvidar a su telefono ;)");
    } 
}
