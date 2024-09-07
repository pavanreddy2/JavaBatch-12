package com.ar.methods;

/**
 * instance method without return Type and With parameter.
 */
public class NoReturnTypeAndWithParameters {

    /**
     * @param i  is int dataType.
     */
    public void m1 (int i){
        System.out.println(i);
    }

    /**
     *
     * @param i is int dataType
     * @param j is int dataType
     */
    public void m2 (String i, int j){
        System.out.println("Sum: "+ (i + j));
    }

    public static void main(String[] args) {
        NoReturnTypeAndWithParameters ref = new NoReturnTypeAndWithParameters();

        ref.m1(100);

        ref.m2("abbas", 200);
    }
}
