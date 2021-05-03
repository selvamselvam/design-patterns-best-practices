package com.careerdrill.objectprincipal.lsp;

import com.careerdrill.objectprincipal.lsp.entity.*;

public class LiskovSubstitutionPrinciple implements InterfaceTest {
    public static void main(String[] args) {

        Shape s = new Circle(5);
        s.calculateArea();

        s = new Square(5);
        s.calculateArea();


        Area a = new Area();
        a.calculateArea(s);


        InterfaceTest.display();

        //throws Not implemented Exception
        //s = new Rectangle(2,5);
        //a.calculateArea(s);



        // create object
        LiskovSubstitutionPrinciple obj = new LiskovSubstitutionPrinciple();
        obj.displayWords();
        obj.overrideDisplay();
    }

    @Override
    public void displayWords() {
        System.out.println("Display Words");
    }
}
