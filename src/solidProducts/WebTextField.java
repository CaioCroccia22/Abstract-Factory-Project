/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidProducts;

import abstractProducts.TextField;

/**
 *
 * @author Caio
 */
public class WebTextField implements TextField{
    private String value;
    
    //Here we will stay empty constructor to get more flexibility when we implement factory
    public WebTextField(){
        this.value = "";
        
    }

    @Override
    public void setValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
