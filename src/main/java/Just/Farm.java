package Just;

import Witch.Chicken;

import java.util.ArrayList;

public class Farm {


    private ArrayList<Object> chickenCoops = new ArrayList<Object>();
    private ArrayList<Object> stables = new ArrayList<Object>();
    private Farmhouse farmhouse;
    private int numOfChickenCoops = chickenCoops.size();
    private int numOfStables = stables.size();

    public Farm(){

    }

    public Farm(ArrayList<Object> chickenCoops, Farmhouse farmhouse, ArrayList<Object> stables){
        this.chickenCoops = chickenCoops;
        this.farmhouse = farmhouse;
        this.stables = stables;
    }

    public void addChickenCoop(ArrayList<Chicken> chickenCoop){
        chickenCoops.add(chickenCoop);
    }
    public void addStable(ArrayList<Stable> stable){
        stables.add(stable);
    }
    public String getChickenCoops() {
        String str = "";
        for (int i = 0; i < chickenCoops.size(); i++) {
            str = str + chickenCoops.get(i) + "\n";
        }
        return str;
    }
    public String getStables() {
        String str = "";
        for (int i = 0; i < stables.size(); i++) {
            str = str + stables.get(i) + "\n";
        }
        return str;
    }
    public int getNumOfChickenCoops(Farm farm){
        return numOfChickenCoops;
    }

    public int getNumOfStables(Farm farm){
        return numOfStables;
    }

    public void setFarmhouse(Farmhouse house){
        farmhouse = house;
    }

    public Farmhouse getFarmhouse(){
        return farmhouse;
    }

    public static void main(String [] args){


    }
}
