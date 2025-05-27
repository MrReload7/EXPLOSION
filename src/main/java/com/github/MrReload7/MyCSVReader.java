package com.github.MrReload7;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyCSVReader {
    public static void main(String [] args){

        countryStats country = new countryStats();
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to ghetto Nukemap! Please consult the README file for how to use this program.\nPlease select a country.");
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
        String [] nextLine;
        try {
            while ((nextLine = reader.readNext()) != null) {

                if(nextLine[0].equals(input)){
                    String str = nextLine[9];
                    int num = Integer.parseInt(str);
                    country.addCity(new cityStats(nextLine[0], num));
                }
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {

            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print(country.showCities());
}
}