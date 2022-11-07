package org.example;

import java.util.Scanner;

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
        //findSumAndInvalidIntCount(args);
        getName(args);
        checkLeapYear();
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
    //Method to find sum of command line integers and count invalid integers
    public static void findSumAndInvalidIntCount(String[] args)
    {
       int sum=0;
       int invalidIntCount=0;
        for (int i=0;i< args.length;i++)
        {
            try {
                sum=sum+Integer.parseInt(args[i]);
            }catch(NumberFormatException e)
            {
                invalidIntCount++;
            }
        }
        System.out.println("Sum of input number="+sum);
        System.out.println("Number of invalid inputs="+invalidIntCount);
    }
    //Method to get name via CLA
    public static void getName(String[] args)
    {
        String name=args[0];
        System.out.println("Name accepted from command line is "+name);
    }
    //Method to check leap year
    public static void checkLeapYear()
    {
        int year;
        boolean isLeap=false;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter year");
        year=sc.nextInt();
        if(year>1582)
        {
            if (year % 4 == 0)
            {
                if (year % 100 == 0)
                {
                    if (year % 400 == 0)
                        isLeap = true;
                    else
                        isLeap = false;
                }
                else
                    isLeap = true;
            }
            else
                isLeap = false;
        }
        else
            System.out.println(" Invalid Year ");

        if (isLeap)
            System.out.println(year+" is leap year");
        else
            System.out.println(year+" is not leap year");
    }
}
