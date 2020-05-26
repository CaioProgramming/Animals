/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package animalsproject;

import animais.Abelha;
import animais.Iguana;
import animais.Pinguim;
import animais.Tubarao_branco;
 import animais.Urso;

/**
 *
 * @author cacai
 */
public class AnimalsProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Urso urso = new Urso(4, "ruim", 34);
        Pinguim pinguim = new Pinguim(2, "visão adaptada ao mergulho", 32);
        Iguana iguana = new Iguana(4, "Periférica excelente", 13);
        Tubarao_branco tubaraoBranco = new Tubarao_branco(0, "Míope", 70);
        Abelha abelha = new Abelha(6, "visão de 280 graus", 0.5);
        showAnimalsData(urso,pinguim,iguana,tubaraoBranco,abelha);
        
        
     }
    
    
    public static void showAnimalsData(Animal... animals){
        for(Animal a : animals){
            System.out.println("\n" + a.getClass().getSimpleName());
            System.out.println("Patas -> " + a.getPatas());
            System.out.println("Idade máxima -> " + a.getIdade_max() + " anos");
            a.mover();
            a.comer();
            a.brigar();
        }
        
        
        
    }
    
}
