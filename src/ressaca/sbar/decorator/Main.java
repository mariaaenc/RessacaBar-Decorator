/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ressaca.sbar.decorator;

/**
 *
 * @author maria
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Drink drink = new Cachaça();
        System.out.println(drink.getDescription()+" $"+ 
                drink.preço());
        Drink drink2 = new Rum();
        drink2 = new Abacaxi(drink2);
        drink2 = new Coco(drink2);
        drink2 = new LeiteCondensado(drink2);
        System.out.print(drink2.getDescription());
        System.out.println(" $" + drink2.preço());  
        Drink drink3 = new Vodka();
        drink3 = new Morango(drink3);
        drink3 = new Adoçante(drink3);
        System.out.print(drink3.getDescription());
        System.out.println(" $" + drink3.preço());
        Drink caipirinha = new Caipirinha();
        System.out.println(caipirinha.getDescription()+" $"+ 
                caipirinha.preço());
    }
}
