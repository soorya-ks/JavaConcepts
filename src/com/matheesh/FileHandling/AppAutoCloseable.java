package com.matheesh.FileHandling;

import java.io.*;


/* This is an alternative solution and modern way of closing the resources automatically*/

public class AppAutoCloseable {
    public static void main(String[] args){
        File file = new File("src/com/matheesh/FileHandling/test.txt");

        try(FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
        ) {
            
            String str = br.readLine();

            while(str != null){
                System.out.println(str);
                str = br.readLine();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
