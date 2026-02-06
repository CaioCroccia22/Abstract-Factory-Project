/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abstractProducts;

/**
 *
 * @author Caio
 */
public interface Button {
      public void setText(String text);
      
      public void setIcons(String iconName);
      
      public void setEnable(boolean enable);
      
      public boolean getEnable();
      
      public void onClick(String event);
}
