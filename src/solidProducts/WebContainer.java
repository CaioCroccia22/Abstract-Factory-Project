/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solidProducts;

import abstractProducts.Container;

/**
 *
 * @author Caio
 */
public class WebContainer implements Container{
    private int height;
    
    private int width;
    
    private int margin;
    
    private int padding;
    
    public WebContainer(){
        this.height = 0;
        this.width = 0;
        this.margin = 0;
        this.padding = 0;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }

    @Override
    public int getMargin() {
        return margin;
    }

    @Override
    public void setMargin(int margin) {
        this.margin = margin;
    }

    @Override
    public int getPadding() {
        return padding;
    }

    @Override
    public void setPadding(int padding) {
        this.padding = padding;
    }

    @Override
    public void addChild(String component) {
        System.out.print(component);
    }

    @Override
    public void setLayout(int height, int width) {
       System.out.print("Your layout size is = " + (height * width) + "px" ); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
