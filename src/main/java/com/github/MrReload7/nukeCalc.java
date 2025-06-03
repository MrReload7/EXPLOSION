package com.github.MrReload7;

public class nukeCalc {
    public nukeCalc(){}

    public double getCasualties(int yeild, double density){
        double pi = Math.PI;
        double area = pi*Math.pow((Math.cbrt(yeild)*0.28), 2);
        double blast = (pi*Math.pow(Math.pow(130*(yeild*1000000), 1/6),2))-area;
        return (area * density) + (blast*density)/2;
    }


}
