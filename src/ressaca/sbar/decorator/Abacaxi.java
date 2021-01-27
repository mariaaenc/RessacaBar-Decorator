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
public class Abacaxi extends CondimentDecorator{
    Drink drink;
    
    public Abacaxi(Drink drink){
        this.drink = drink;
    }
    
    @Override
    public String getDescription(){
        return drink.getDescription()+", Abacaxi";
    }
    
    @Override
    public double preço(){
        return 3.00 + drink.preço();
    }
}
