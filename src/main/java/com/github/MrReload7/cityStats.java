package com.github.MrReload7;

public class cityStats {
    private String name;
    private int population;
    public cityStats(String name, int population){
        this.name = name;
        this.population = population;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getPop(){
        return population;
    }
    public void setPopulation(int population){
        this.population = population;
    }
}
