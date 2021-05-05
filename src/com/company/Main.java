package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            FileInputStream file = new FileInputStream("C:\\Users\\rk-pa\\IdeaProjects\\Lesson4App\\inputFile.txt");
            BufferedInputStream bis = new BufferedInputStream(file);
            String str = new String();

            int i;

            while((i = bis.read())!= -1){
                str = str + (char)i;
            }

            str = str.replace(',', ' ');

            FileOutputStream file_out = new FileOutputStream("C:\\Users\\rk-pa\\IdeaProjects\\Lesson4App\\outputFile.txt");
            file_out.write(str.getBytes());
        } catch (IOException e) {
            System.out.print("File not found");
        }
    }
}
