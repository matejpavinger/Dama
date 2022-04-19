package com.company;

import java.util.Scanner;

public class vstup {

    public vstup(){};

    public String read(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("> ");
        return scanner.nextLine();

    }
}
