package com.ar.operators;

/**
 * creating IncrementAndDecrement operator
 */
public class IncrementAndDecrementEx {

    public static void main(String[] args) {

        int i = 100;
        int j = ++i;

        int k = ++j;

        int a = k++;
        int b = a++;

        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(a);
        System.out.println(b);


        System.out.println("Pre & Post Decrement...........");
        //Pre And Post decrement

        int a1 = 100;

        int b1 = a1--;

        int c1 = --a1;
        System.out.println(a1); // 98
        System.out.println(b1); //100
        System.out.println(c1); //98


    }
}
