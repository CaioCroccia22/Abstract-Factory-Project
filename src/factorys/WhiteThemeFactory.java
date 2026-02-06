/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorys;

import solidProducts.WebButton;
import solidProducts.WebContainer;
import solidProducts.WebTextField;

/**
 *
 * @author Caio
 */
public class WhiteThemeFactory implements LayoutFactory{

     @Override
    public WebButton createButton() {
        return new WebButton();
    }

    @Override
    public WebContainer createContainer() {
        return new WebContainer();
    }

    @Override
    public WebTextField createTextField() {
        return new WebTextField();
    }
    
}
