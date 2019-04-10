package Just;

import Witch.Chicken;

import java.util.ArrayList;

public class ChickenCoop {
    ArrayList<Chicken> chickens = new ArrayList<Chicken>();
    private int numOfChickens = chickens.size();

    public ChickenCoop(ArrayList<Chicken> chickens){
        this.chickens = chickens;
    }

    public void addChickens(Chicken chicken){
        chickens.add(chicken);
    }
    public String getChickens() {
        String str = "";
        for (int i = 0; i < chickens.size(); i++) {
            str = str + chickens.get(i) + "\n";
        }
        return str;
    }
    public int getNumOfChickens(ChickenCoop chickenCoop){
        return numOfChickens;
    }
}
