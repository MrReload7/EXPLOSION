package com.github.MrReload7;
import java.util.ArrayList;

public class countryStats {
     ArrayList<cityStats> cities = new ArrayList<>();
     
     public countryStats(){}
     
     public void addCity(cityStats city){
        cities.add(city);
     }

     public cityStats getCity(String name){
        for(int i = 0; i < cities.size(); i++){
            if(cities.get(i).getName().equals(name)){
                return cities.get(i);
            }
        }
        return null;
     }

     public String showCities(){
        String ret = "";
        for(int i = 0; i < cities.size(); i++){
            ret += cities.get(i).getName() + " Population: " + cities.get(i).getPop();
        }
        return ret;
     }
}
