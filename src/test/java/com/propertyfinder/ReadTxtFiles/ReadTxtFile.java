package com.propertyfinder.ReadTxtFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadTxtFile {

    public static void main(String[] args) {

    }
    public static List<String> txtReaderAE(){
        ArrayList<String> listOfLines = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("docs/AE_Landing_pages.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
    public static List<String> txtReaderEG(){
        ArrayList<String> listOfLines = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("docs/EG_Landing_pages.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
    public static List<String> txtReaderSA(){
        ArrayList<String> listOfLines = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("docs/SA_Landing_pages.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
    public static List<String> txtReaderBH(){
        ArrayList<String> listOfLines = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("docs/BH_Landing_pages.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
    public static List<String> txtReaderQA(){
        ArrayList<String> listOfLines = new ArrayList<>();
        try{
            BufferedReader bufferedReader = new BufferedReader(new FileReader("docs/QA_Landing_pages.txt"));
            String line = bufferedReader.readLine();
            while (line != null) {
                listOfLines.add(line);
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfLines;
    }
}

