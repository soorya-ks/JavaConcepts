package com.matheesh.filehandling;

import java.io.*;

public class AppFileReader {

    public static void main(String[] args){
        BufferedReader br = null;
        try {
            File file = new File("src/com/matheesh/FileHandling/test.txt");
            FileReader fr = new FileReader(file);
            br = new BufferedReader(fr);

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
        finally{
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
