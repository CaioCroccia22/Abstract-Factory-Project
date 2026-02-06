/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidProducts;

import abstractProducts.Button;

/**
 *
 * @author Caio
 */
public class WebButton implements Button{
    private boolean enable;

    public WebButton() {
        this.enable = false;
    }

    @Override
    public boolean getEnable() {
        return enable;
    }
    
    @Override
    public void setEnable(boolean enable) {
        this.enable = enable;
    }
    
    @Override
    public void setText(String text) {
        System.out.print("Click here"); 
    }

    @Override
    public void setIcons(String iconName) {
        System.out.print("Check icon");
    }

   
    @Override
    public void onClick(String event) {
         System.out.print("Trigger event: " + event);
    }
}
