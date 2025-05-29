package com.github.MrReload7;

public class nukeCalc {
    public nukeCalc(){}

    public double getCasualties(int yeild, double density){
        double pi = Math.PI;
        double area = pi*Math.pow((Math.cbrt(yeild)*0.28), 2);
        
        return area * density;
    }


}
