/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package App;

import factorys.LayoutFactory;
import solidProducts.WebButton;
import solidProducts.WebContainer;
import solidProducts.WebTextField;

/**
 *
 * @author Caio
 */
public class Client {

    /**
     * @param args the command line arguments
     */
        
        private LayoutFactory factory;
        
        public Client(LayoutFactory factory){
            this.factory = factory;
        }
        
        public void generateLayout(String theme){
            WebButton button = factory.createButton();
            WebTextField textField = factory.createTextField();
            WebContainer container = factory.createContainer();
            button.onClick("Call fuction");
            container.setMargin(30);
            container.getMargin();
            container.setLayout(10, 30);
        }
    
}
