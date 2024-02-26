package com.example.decoratorinjakarta;

public class Child implements Parent{
    @Override
    public void printText() {
        System.out.println("Child print text...");
    }
}
