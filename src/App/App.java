/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package App;

import factorys.DarkThemeFactory;
import factorys.LayoutFactory;
import factorys.WhiteThemeFactory;
import java.util.Objects;



/**
 *
 * @author Caio
 */
public class App {
    public static void main (String[] args){
        
        LayoutFactory factory = null;
        
        if (Objects.equals(args[0], "Dark")){
            factory = new DarkThemeFactory();
        } else if (Objects.equals(args[0], "White")){
            factory = new WhiteThemeFactory();
        } else {
            System.out.print("Tema não existe");
            
        }

        Client client = new Client(factory);
        client.generateLayout("Dark");
    }        
    
}
