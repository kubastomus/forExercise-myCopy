package com.company.Exceptions.FileExc;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        loadFile("C:/Filemon");
        System.out.println("This line won't be displayed");
    }

    public static void loadFile(String path) throws FileNotFoundException {

        File file = new File(path);
        InputStream inputStream = new FileInputStream(file);
    }

}
