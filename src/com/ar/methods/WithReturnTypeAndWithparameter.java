package com.ar.methods;

/**
 * instance method with return Type & with input parameters.
 */
public class WithReturnTypeAndWithparameter {

    /**
     *
     * @param i
     * @param j
     * @param k
     * @return
     */
    public int m1 (int i, int j, int k){
        return i + j + k;
    }

    public String m2 (int i, String j){
        String str =  i + j;
        return str;
    }

    public static void main(String[] args) {
        WithReturnTypeAndWithparameter ref = new WithReturnTypeAndWithparameter();
       int sum =  ref.m1(100, 200, 300);
       System.out.println(sum);

       String s = ref.m2(200,"abbas");
       System.out.println(s);
    }
}
