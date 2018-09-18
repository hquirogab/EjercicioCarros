/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

/**
 *
 * @author Hernan Quiroga
 */
public class EjercicioCarros {
    public static void main(String[] args) {
        Rueda ruedas1[] = new Rueda[4];
        for (int i = 0; i < ruedas1.length; i++) {
            ruedas1[i] = new Rueda(13, "Michelin");
        }
        
        Rueda ruedas2[] = new Rueda[4];
        for (int i = 0; i < ruedas2.length; i++) {
            ruedas2[i] = new Rueda(17, "Firestone");
        }
        
        Motor motor1 = new Motor(1500, 8);
        Motor motor2 = new Motor(3500, 8);
        Carro carro1 = new Carro("Chevrolet", "Aveo", ruedas1, motor1, 5);
        Carro carro2 = new Carro("Jeep", "Wrangler",ruedas2, motor2, 5);
        Persona persona1 = new Persona("Persona");
        persona1.setCarro(carro1);
        persona1.setCarro(carro2);
       
        persona1.imprimirInfo();
    }
}
