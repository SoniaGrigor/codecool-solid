package org.example.p1_single_responsability.bad;


public class WindowsConsole implements Device {
    public void display(String text){
        System.out.println(text);
    }
}
