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
public class Rueda {
    private int diametroPulgadas;
    private String marca;

    public Rueda(int diametroPulgadas, String marca) {
        this.diametroPulgadas = diametroPulgadas;
        this.marca = marca;
    }
    
    
    
    public int getDiametroPulgadas() {
        return diametroPulgadas;
    }

    public void setDiametroPulgadas(int diametroPulgadas) {
        this.diametroPulgadas = diametroPulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String brand) {
        this.marca = brand;
    }

    
}
