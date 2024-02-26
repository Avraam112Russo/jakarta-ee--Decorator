package com.example.decoratorinjakarta;

import jakarta.decorator.Decorator;
import jakarta.decorator.Delegate;
import jakarta.inject.Inject;

@Decorator
public class MyDecorator implements Parent{
    @Inject
    @Delegate
    //child
    private Parent parent;
    @Override
    public void printText() {
        System.out.println("Wrapper work. Additionally functional...");
        parent.printText();//child print text
        System.out.println("Wrapper work 2. One more additionally functional...");
    }
}
