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
public interface LayoutFactory {
    WebButton createButton();
    
    WebContainer createContainer();
    
    WebTextField createTextField();
    
}
