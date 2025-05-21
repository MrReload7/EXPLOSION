package com.github.MrReload7;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class CSVReader {
    public static void main(String [] args){

        String file = "worldcities.csv";
        //instantiate CSV reader class
        
        CSVReader reader = new CSVReader(new FileReader(file));

    }
}
