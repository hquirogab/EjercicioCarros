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
public class Persona {
    private String nombre;
    private Carro[] carros;
    private int counter = 0;

    public Persona(String nombre) {
        this.nombre = nombre;
        this.carros = new Carro[5];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setCarro(Carro carro) {
        this.carros[counter] = carro;
        counter++;
    }
    
    public void imprimirInfo(){
        System.out.println(this.nombre + " tiene " + counter + " carros");
        for (int i = 0; i < counter; i++) {
            System.out.print("Carro #" + (i+1) + ": ");
            System.out.println(carros[i].getMarca() + " " + carros[i].getModelo());
            System.out.print(">" + carros[i].getRuedas().length + " ruedas");
            System.out.print(" de " + carros[i].getRuedas()[0].getDiametroPulgadas() + " pulgadas");
            System.out.println(" marca " + carros[i].getRuedas()[0].getMarca());
            System.out.println(">Chasis con capacidad para " + this.carros[i].getChasis().getSeats() + " sillas");
            System.out.print(">Motor de " + this.carros[i].getMotor().getLitros() + " litros");
            System.out.println(" y " + this.carros[i].getMotor().getCilindros() + " cilindros");
        }
    }
}
