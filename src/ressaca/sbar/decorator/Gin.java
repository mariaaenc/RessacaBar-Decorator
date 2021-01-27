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
public class Gin extends Drink{
    public Gin(){
        description = "Gin, gelo";
    }
    
    @Override
    public double preço(){
        return 10.00;
    }
}
