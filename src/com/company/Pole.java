package com.company;

public class Pole {
    public char[][] hraciPole;
    public void poleVytvor() {
        hraciPole = new char [8][8];
    }

    public void poleTisk(){
        for (int i = 0; i < this.hraciPole.length; i++) {
            System.out.print(i+"|");
            for (int e = 0; e < this.hraciPole[i].length; e++) {
                if ((i + e) % 2 == 0) {
                    hraciPole[i][e] = '0'; // bílé pole = 0
                }
                else {hraciPole[i][e] = '1';} // černé pole = 1
                for (Kamen k:Main.kameny){
                    if(k.x==i && k.y==e){
                        hraciPole[i][e]=k.barva;
                    }
                }
                System.out.print(hraciPole[i][e]);
            }
            System.out.println();
        }
        System.out.println("  --------");
        System.out.println("  01234567");
    }
}
