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
public class Caipirinha extends Drink{
    public Caipirinha(){
        description = "Caipirinha: Cachaça, limão, gelo e açucar";
    }
    
    @Override
    public double preço(){
        return 18.00;
    }
    
}
