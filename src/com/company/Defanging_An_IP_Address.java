package com.company;

public class Defanging_An_IP_Address {
    public static void main(String[] args) {
        String s = "1.1.1.1";
        String s1 = s.replace(".", "[.]");
        System.out.println(s1);
    }
}
