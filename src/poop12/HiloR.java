/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop12;

/**
 *
 * @author alumno
 */
public class HiloR implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Iteraciòn "+i+" del "+Thread.currentThread().getName());//Thread es una tabla con varios thread almacenados y de esos tomar el actual y obtener su nombre
        }
        System.out.println("Termina el "+Thread.currentThread().getName());
    }
    
}
