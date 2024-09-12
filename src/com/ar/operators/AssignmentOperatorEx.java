package com.ar.operators;

/**
 * Creating Assignment Operators
 */
public class AssignmentOperatorEx {
    public static void main(String[] args) {

        int a = 200;

        int b = a;

        int c = b;
        System.out.println(a); //200
        System.out.println(b); //200
        System.out.println(c); //200

        //+=
        System.out.println(c += 2); // 202 ==> c = c + 2 ==> 202
        //-=
        System.out.println(b -= 100); // 100 ==> b = b - 100 ==> 100
    }
}
