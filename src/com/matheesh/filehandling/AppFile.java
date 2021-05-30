package com.matheesh.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class AppFile {

    public static void main(String[] args) throws FileNotFoundException {

        File input = new File("src/com/matheesh/FileHandling/test.txt");
        Scanner sc = new Scanner(input);

        while(sc.hasNextLine()){
            System.out.println(sc.nextLine());
        }
        sc.close();

    }
}
