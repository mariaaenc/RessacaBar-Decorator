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
public class Kiwi extends CondimentDecorator{
    Drink drink;
    
    public Kiwi(Drink drink){
        this.drink = drink;
    }
    
    @Override
    public String getDescription(){
        return drink.getDescription()+", Kiwi";
    }
    
    @Override
    public double preço(){
        return 4.00 + drink.preço();
    }
}
