package com.careerdrill.objectprincipal.lsp.entity;

public class Rectangle implements Shape{

    private int width;
    private int length;

    public Rectangle(int w, int l) {
        this.length = l;
        this.width= w;
    }

    @Override
    public void calculateArea() {

    }
}
