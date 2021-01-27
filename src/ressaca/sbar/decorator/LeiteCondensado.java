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
public class LeiteCondensado extends CondimentDecorator{
    Drink drink;
    
    public LeiteCondensado(Drink drink){
        this.drink = drink;
    }
    
    @Override
    public String getDescription(){
        return drink.getDescription()+", Leite Condensado";
    }
    
    @Override
    public double preço(){
        return 5.00 + drink.preço();
    }
}
