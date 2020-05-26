/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animais;

import animalsproject.Inseto;

/**
 *
 * @author cacai
 */
public class Abelha extends Inseto{

    public Abelha(int patas, String visao, double idade_max) {
        super(patas, visao, idade_max);
    }
    
    

    

    @Override
    public void comer() {
        System.out.println("Alimentando-se de nutrientes de flores!");
    }

    @Override
    public void mover() {
        System.out.println("Movimentando-se através do voo!");//To change body of generated methods, choose Tools | Templates.
    }

    

     
    
}
