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
public class Motor {
    private int litros;
    private int cilindros;

    public Motor(int litros, int cilinders) {
        this.litros = litros;
        this.cilindros = cilinders;
    }

    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = litros;
    }

    public int getCilindros() {
        return cilindros;
    }

    public void setCilinders(int cilindros) {
        this.cilindros = cilindros;
    }
    
}
