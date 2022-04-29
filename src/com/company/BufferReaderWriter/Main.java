package com.company.BufferReaderWriter;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {



        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\marta\\IdeaProjects\\forExercise\\src\\com\\company\\BufferReaderWriter\\File.txt"));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\Users\\marta\\IdeaProjects\\forExercise\\src\\com\\company\\BufferReaderWriter\\Update.txt")))
        {

            String line = bufferedReader.readLine();
            int count = 0;

            while (line != null) {
                String [] words = line.split(" ");
                System.out.println(line);
                count += words.length;
                line = line.toUpperCase();
                bufferedWriter.write(line + "\n");
                line = bufferedReader.readLine();

            }
            System.out.println(count);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
}
