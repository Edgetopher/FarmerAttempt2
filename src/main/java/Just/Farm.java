package Just;

public class Farm {


    ChickenCoop[] chickenCoops;
    Stable[] stables;
    Farmhouse farmhouse;
    int numOfChickenCoops = chickenCoops.length;
    int numOfStables = stables.length;

    public Farm(ChickenCoop[] chickenCoops, Farmhouse farmhouse, Stable[] stables){
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;
        this.stables = stables;
    }

    public int getNumOfChickenCoops(Farm farm){
        return numOfChickenCoops;
    }

    public int getNumOfStables(Farm farm){
        return numOfStables;
    }

    public Farmhouse getFarmhouse(Farm farm){
        return farmhouse;
    }
}
