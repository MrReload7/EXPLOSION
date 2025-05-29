package com.github.MrReload7;

public class nukeCalc {
    public nukeCalc(){}

    public double getCasualties(int yeild, double density){
        double area = Math.cbrt(yeild)*0.28;
        return area * density;
    }


}
