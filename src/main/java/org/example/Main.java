package org.example;

public class Main {
    static String stringObj;
    static int  intObj;
    static float floatObj;
    static char charObj;
    static double doubleObj;
    static boolean booleanObj;
    public static void main(String[] args)
    {
        displayAMessage();
        displayDefaultValues();
        checkStringEquals();
    }
    //Method to display Welcome message
    public static void displayAMessage()
    {
        System.out.println("Welcome to Bridgelabz LFP program");
    }
    //Method to display default values of all data types
    public static void displayDefaultValues()
    {
        System.out.println("Default values of primitive datatypes are as follows");
        System.out.println("String="+stringObj);
        System.out.println("int="+intObj);
        System.out.println("float"+floatObj);
        System.out.println("char="+charObj);
        System.out.println("double="+doubleObj);
        System.out.println("boolean="+booleanObj);
    }
    //Method to check strings are equal or not
    public static void checkStringEquals()
    {
        String stringOne="Bridgelabz";
        String stringTwo="Bridgelabz";
        if(stringOne.equals(stringTwo))
            System.out.println("Both strings are equals");
        else
            System.out.println("Both strings are not equals");
    }
}