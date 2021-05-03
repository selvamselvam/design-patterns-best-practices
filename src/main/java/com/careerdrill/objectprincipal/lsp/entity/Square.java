package com.careerdrill.objectprincipal.lsp.entity;

public class Square implements Shape{

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    private int side;

    public Square(int side){
        this.side = side;
    }

    @Override
    public void calculateArea() {
        System.out.println("Square Area :" + getSide() * getSide());
    }
}
