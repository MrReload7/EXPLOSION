import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class readCSV {

    public static void main(String [] args){

        //instantiate CSV reader class

        CSVReader reader = new CSVReader(new FileReader(worldcities.csv));

    }
}