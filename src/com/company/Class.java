package com.company;

public class Class {
    private int a;
    private String s;
    private int[] arr;

    public  Class(int a, String s, int ... arr) {

    }
    public void setA(int a) {
        this.a = a;
    }
    public int getA() {
        return a;
    }



    public String getS() {
        return s;
    }

    public void setS(String s) {
        this.s = s;
    }




    public void setArr(int...arr) {
        this.arr = arr;
    }
    public int[] getArr() {
        return arr;
    }
}
