/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop12;

/**
 *
 * @author alumno
 */
public class POOP12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Solo en memoria para que se ejecute, no se crea objeto para almacenar
        //Se crea nueva instancia que va directamente al mètodo start
        new HiloT("PrimerHilo").start();
        
        //lo mismo pero manteniendo el objeto
        HiloT hilo2 = new HiloT("SegundoHilo");
        hilo2.start();

        
        
        //ALternativa mas dificil, pero si HiloR aun puede heredar de algun otro ladoy el anterior mètodo no puede por ya esta heredadno de thread
        new Thread(new HiloR(),"Tercer hilo").start();
        new Thread(new HiloR(),"Cuarto hilo").start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteracion "+i+" del hilo main");
        }
        //El main termina antes que el resto porque los demàs hilos porque tiene menos acciones o porque la computadora dedica menos recursos.
        System.out.println("Hilo Main terminado");
    }
    
}
