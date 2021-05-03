package com.careerdrill.objectprincipal.lsp.entity;


import org.apache.commons.lang3.NotImplementedException;

public class Area {
    public void calculateArea(Shape s){
        if(s instanceof Circle){
            ((Circle) s ).calculateArea();
        }else if(s instanceof Square){
            ((Square) s ).calculateArea();
        }else{
            throw new NotImplementedException("Not implemented other Shape");
        }
    }
}
