package com.github.MrReload7;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class MyCSVReader {
    public static void main(String [] args){

        String file = "worldcities.csv";
        FileReader fr;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Unable to load file");
            System.exit(1);
            return;
        }
        
        CSVReader reader = new CSVReader(fr);

    }
}
