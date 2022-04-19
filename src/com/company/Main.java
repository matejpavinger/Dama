package com.company;

import java.util.ArrayList;

public class Main {
    public static Pole hraciPole;
    public static Kamen c1, c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12;
    public static Kamen b1, b2, b3, b4, b5, b6, b7, b8, b9, b10, b11, b12;
    public static vstup vstup;
    public static String input;
    public static int odkudX;
    public static int odkudY;
    public static int kamX;
    public static int kamY;
    public static ArrayList<Kamen> kameny;
    public static Kamen kVyhozeni;

    public static void main(String[] args){
        kameny=new ArrayList<Kamen>();
        hraciPole=new Pole();  // c = + = cerny kamen
        c1 = new Kamen(7, 0, '+');  c2 = new Kamen(7, 2, '+');
        c3 = new Kamen(7, 4, '+');  c4 = new Kamen(7, 6, '+');
        c5 = new Kamen(6, 1, '+');  c6 = new Kamen(6, 3, '+');
        c7 = new Kamen(6, 5, '+');  c8 = new Kamen(6, 7, '+');
        c9 = new Kamen(5, 0, '+');  c10 = new Kamen(5, 2, '+');
        c11 = new Kamen(5, 4, '+');  c12 = new Kamen(5, 6, '+');

                                // b = - = bily kamen
        b1 = new Kamen(0, 1, '-');  b2 = new Kamen(0, 3, '-');
        b3 = new Kamen(0, 5, '-');  b4 = new Kamen(0, 7, '-');
        b5 = new Kamen(1, 0, '-');  b6 = new Kamen(1, 2, '-');
        b7 = new Kamen(1, 4, '-');  b8 = new Kamen(1, 6, '-');
        b9 = new Kamen(2, 1, '-');  b10 = new Kamen(2, 3, '-');
        b11 = new Kamen(2, 5, '-');  b12 = new Kamen(2, 7, '-');

        kameny.add(c1);
        kameny.add(c2);
        kameny.add(c3);
        kameny.add(c4);
        kameny.add(c5);
        kameny.add(c6);
        kameny.add(c7);
        kameny.add(c8);
        kameny.add(c9);
        kameny.add(c10);
        kameny.add(c11);
        kameny.add(c12);
        kameny.add(b1);
        kameny.add(b2);
        kameny.add(b3);
        kameny.add(b4);
        kameny.add(b5);
        kameny.add(b6);
        kameny.add(b7);
        kameny.add(b8);
        kameny.add(b9);
        kameny.add(b10);
        kameny.add(b11);
        kameny.add(b12);
        System.out.println("Vítejte ve hře dáma :) Symbol + značí černé kameny, symbol - značí bílé kameny. " +
                "Bílé pole je 0, černé pole je 1. Hráči se střídají a vždy zapíší souřadnice políčka," +
                " na které se chtějí přesunout. Souřadnice jsou vyznačeny na levé straně pole a spodní straně," +
                " čísly 0-7");
        hraciPole.poleVytvor();
        hraciPole.poleTisk();
        vstup = new vstup();
        while(true) {
            System.out.println("Vyberte kámen, kterým chcete táhnout:");
            input = vstup.read();
            String[] slova = input.split("(?!^)");
            odkudX = Integer.parseInt(slova[0]);
            odkudY = Integer.parseInt(slova[1]);
            System.out.println("Vyberte pole, na které chcete kámen přesunout:");
            input = vstup.read();
            slova = input.split("(?!^)");
            kamX = Integer.parseInt(slova[0]);
            kamY = Integer.parseInt(slova[1]);
            for (Kamen k : kameny) {
                if (k.x == odkudX && k.y == odkudY) {
                    k.kamenPohyb(kamX, kamY);
                }
                if (k.x == (kamX+odkudX)/2 && k.y == (kamY+odkudY)/2){
                    kVyhozeni=k;
               }
            }
            kameny.remove(kVyhozeni);
            hraciPole.poleTisk();
        }
    }
}
