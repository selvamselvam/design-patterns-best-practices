package com.careerdrill.objectprincipal.lsp.entity;

public class Circle implements Shape{

    public Circle(int radius){
        this.radius = radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    private int radius;

    @Override
    public void calculateArea() {
        System.out.println("Circle Area :" + (Math.PI *  getRadius() * getRadius()));
    }
}
