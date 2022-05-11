package com.company;

import java.util.Arrays;

public class Class {
    private int a;
    private String s;
    private int[] arr;

    public  Class(int a, String s, int ... arr) {
        this.a=a;
        this.s=s;
        this.arr=arr;
        System.out.println("Class{" + "a=" + a + ", s='" + s + '\'' + ", arr=" + Arrays.toString(arr) + '}');
    }


   /* public String toString() {
        return "Class{" + "a=" + a + ", s='" + s + '\'' + ", arr=" + Arrays.toString(arr) + '}';
    }*/
}
