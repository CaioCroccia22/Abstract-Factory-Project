/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package abstractProducts;

/**
 *
 * @author Caio
 */
public interface Container {
    public void setHeight(int height);
    
    public int getWidth();

    public void setWidth(int width) ;

    public int getMargin() ;

    public void setMargin(int margin);

    public int getPadding() ;

    public void setPadding(int padding);
    
    
    public void addChild(String component);
    
    public void setLayout(int height, int width);
    
}
