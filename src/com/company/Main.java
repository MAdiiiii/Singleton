package com.company;

import static com.company.Singleton.*;

public class Main {

    public static void main(String[] args) {
        Singleton object = new Singleton.getInstance();
        object.ShowMessage();



    }
}

class Singleton
{
    private  static Singleton instance = new Singleton();
    private Singleton(){}
    private  static Singleton getInstance()
    {
        return instance;
    }

    public  void ShowMessage()
    {
        System.out.println("hellow");
    }

    public static class getInstance extends Singleton {
    }
}


