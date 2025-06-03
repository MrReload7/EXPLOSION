package com.github.MrReload7;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyCSVReader {
    public static void main(String [] args){
        nukeCalc calc = new nukeCalc();
        countryStats country = new countryStats();
        Scanner scanner = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Scanner scanned = new Scanner(System.in);
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
        String input = scanner.nextLine();
        String [] nextLine;
        try {
            while ((nextLine = reader.readNext()) != null) {
                
                if(nextLine[4].equals(input)){    
                    String str = nextLine[9];
                    int num = Integer.parseInt(str);
                    if (num >= 100000){                    
                        country.addCity(new cityStats(nextLine[0], num));
                    }
                }
            }
        } catch (CsvValidationException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(country.showCities());
        System.out.println("Select a city.");
        input = scanner.nextLine();

        System.out.println("Select a yeild (in kilotons of TNT)");
        String inp = scan.nextLine();
        int number = Integer.parseInt(inp);
        System.out.println("Select a population density (consult README)");
        String dens = scanned.nextLine();
        double density = Integer.parseInt(dens);

        double cas = calc.getCasualties(number,density);
        double perCas = (country.getCity(input).getPop() / (cas))/100;
        System.out.println("Casualties: " + (int)cas);
        System.out.println("Percentage Casualties: " + perCas + "%");
        System.out.println("Homes Destroyed: " + (int)cas/4);
        System.out.println("International Incedents: 1");
}       
}