package com.sda.algorytmy;

/**
 * Hello world!
 */
public class App {
    public static int ciag5(int n) {
        if (n == 1){
        return -1;
        }
            return -ciag5(n -1) *n -3;
    }

    public static double ciag(int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 0.5;
        }
        return -ciag(n - 1) * ciag(n - 2);
    }

    public static int silnia(int n) {
        if (n < 2) {
            return 1;
        }
        return n * silnia(n - 1);
    }

    public static void main(String[] args) {
        silnia(5);
        System.out.println("Wynik dla ciag5 to: " + ciag5(5));
        System.out.println(silnia(5));
        System.out.println(ciag(5));
//        int silnia = 5;
//        int wynik  =1;
//        for(int i=1; i<silnia; i++){
//            wynik = wynik * i;
//        }
//        System.out.println(wynik);
    }
}
