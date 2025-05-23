package com.github.MrReload7;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

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
        
        CSVReader csvReader = new CSVReader(fr);
        countryStats country = new countryStats();
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Welcome to ghetto Nukemap! Please consult the README file for how to use this program.\nPlease select a country.");
        FileReader filereader = new FileReader(file);

        // create csvReader object passing
        // file reader as a paramete
        String[] nextRecord;
        while ((nextRecord = csvReader.readNext()) != null) {
            if(nextRecord[6].equals(myObj)){
                country.addCity(new cityStats(newRecord[6], newRecord[10]));
            }
    }
}
