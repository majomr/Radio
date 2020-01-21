/*Universidad del Valle de Guatemala
Maria Isabel Montoya Valladares
Maria Jose Morales
Hoja de Trabajo 1
Algoritmos y estructura de datos
Clase: interfaz de radio
*/
public interface radioInterfaz{
    String estacionActual();// Devuelve la estacion actual de la radio
    boolean estado();//devuelve el estado de la radio, tanto si esta encendida o en que frecuencia
    void onOff();//Enciende o apaga la radio
    void cambiarFrecuencia();//Cambia la frecuencia de AM a FM a AM
    void avanzar();//Avanza a lo largo del dial, ya sea en AM (de 10 en 10) o en FM (de 0.2 en 0.2)
    void guardar(int boton);// guarda la estacion en la que se encuentra la radio
    void seleccionarEmisora(int boton);//Seleciona una emisora guardada
    
}