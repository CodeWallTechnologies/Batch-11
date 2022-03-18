package com.codewall.batch11.one;

public class DataTypes {
    public static void main(String[] args) {
        byte num1 = 23;
        int num2 = num1;  //type casting => automatic / widening

        byte num3 = (byte)num2; //type casting => narrowing casting

        boolean flag = true;
        boolean flag1 = false;
        flag = false; //update value
        flag1 = true; // update value

        System.out.println(flag); // 1 bit => 0 / 1
        System.out.println(flag1);

        //boolean //char
        char character = 'a';
        System.out.println(character);

        char character1 = 0x61; //a decimal => 97 , Hexadecimal => 0x61
        System.out.println(character1);

        //ascii


    }
}

//keyword
