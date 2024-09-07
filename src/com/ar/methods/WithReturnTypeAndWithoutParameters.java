package com.ar.methods;

/**
 * Instance method With Return Type And Without parameter.
 */
public class WithReturnTypeAndWithoutParameters {

    /**
     * @return  the int.
     */
    public int m1 (){
        return 1000;
    }

    /**
     *
     * @return the char.
     */
    public char m2 () {
        return 'A';
    }

    /**
     *
     * @return the String.
     */
    public String m3 () {
        return "Hi... Good Evening...";
    }
    public static void main(String[] args) {

        WithReturnTypeAndWithoutParameters ref1 = new WithReturnTypeAndWithoutParameters();
        int i = ref1.m1();
        System.out.println(i);

        char ch = ref1.m2();
        System.out.println(ch);

       String str =  ref1.m3();
       System.out.println(str);
    }
}
