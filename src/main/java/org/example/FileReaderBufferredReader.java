package org.example;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderBufferredReader {
    public static void main(String[] args) {

        String[] lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "P:\\Udemy_Nelio_Alves\\TrabalhandoComArquivos\\out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path,true))) {
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}