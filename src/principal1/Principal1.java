/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal1;

/**
 *
 * @author sala3
 */
public class Principal1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Servivo s = new Humano();
        s.comunicarse();

        s = new Pato();
        s.comunicarse();

        s = new Perro();
        s.comunicarse();

    }

}
