package com.company.Exceptions.FileTry;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) {

        try {
            File file = new File("C:/Filemon");
            InputStream is = new FileInputStream(file);
        } catch (FileNotFoundException exc) {
            exc.printStackTrace();

        }
        System.out.println("This line will be displayed BINGO");

    }
}
