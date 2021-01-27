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
public class Rum extends Drink{
    public Rum(){
        description = "Rum, gelo";
    }
    
    @Override
    public double preço(){
        return 10.00;
    }
}
