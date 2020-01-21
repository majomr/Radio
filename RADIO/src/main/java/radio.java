/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*Universidad del Valle de Guatemala
Maria Jose Morales 19145
Maria Isabel Montoya Valladares 19169
Hoja de Trabajo 1
Algoritmos y Estructuras de Datos
Clase: radio
 */
abstract class radio implements radioInterfaz {
    // Se definen las variables de la clase
    private String estado = "encendida";
    private String frecuencia = "AM";
    private double emisoraAM = 530;
    private double emisoraFM = 87.9;
    private double[] AM;
    private double[] FM;
    
    public radio(){
        
    }
    public String estacionActual(){
        if(frecuencia.equalsIgnoreCase("AM")){
            return "Estado de la radio:\n"+ estado + "\nFrecuencia:\n"+ frecuencia+"Emisora actual:\n"+emisoraAM;
        }
        else{
            return "Estado de la radio:\n"+ estado + "\nFrecuencia:\n"+ frecuencia+"Emisora actual:\n"+emisoraFM;
        }
    }
    
    public boolean estado(){
        if (estado.equalsIgnoreCase("encendida")){
            return true;
        }
        else{
            return false; 
        } 
    }
    
    public void onOff(){
        if (estado.equalsIgnoreCase("encendida")){
            estado = "apagada";
        }
        else{
            estado = "encendida"; 
        }
    }
    
    public void cambiarFrecuencia(){
        if (frecuencia.equalsIgnoreCase("AM")){
            frecuencia = "FM";
        }
        else{
            frecuencia = "AM"; 
        }
        
    }
    
    public void avanzar(){
        if(frecuencia.equalsIgnoreCase("AM")){
            if (emisoraAM == 1610)
                emisoraAM = 530;
            emisoraAM = emisoraAM + 10; 
        }
        else{
            if(emisoraFM == 107.9)
                emisoraFM = 87.9;
            emisoraFM = emisoraFM + 0.2; 
        }
    }
    
    public void guardar(int boton){
        if(frecuencia.equalsIgnoreCase("AM")){
            AM[boton--] = emisoraAM;
        }
        else{
            FM[boton--] = emisoraFM;
        }
    }
    
    public void seleccionarEmisora(int boton){
        if(frecuencia.equalsIgnoreCase("AM")){
            emisoraAM = AM[boton--];
        }
        else{
            emisoraFM = FM[boton--];
        }
    }
}
