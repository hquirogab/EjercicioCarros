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
public class Carro {
    private String marca;
    private String modelo;
    private Rueda ruedas[];
    private Motor motor;
    private Chasis chasis;
    private int numSillas;

    public Carro(String marca, String modelo, Rueda[] ruedas, Motor motor, int numSillas) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedas = ruedas;
        this.motor = motor;
        this.chasis = new Chasis(numSillas);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    
    
    public Rueda[] getRuedas() {
        return ruedas;
    }

    public void setRuedas(Rueda[] ruedas) {
        this.ruedas = ruedas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Chasis getChasis() {
        return chasis;
    }
    
    
}
