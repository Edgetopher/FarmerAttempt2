package Just;

import Witch.Horse;

import java.util.ArrayList;

public class Stable {

    private ArrayList<Horse> horses = new ArrayList<Horse>();
    private int numOfHorses = horses.size();

    public Stable(ArrayList<Horse> horses) {
        this.horses = horses;
    }

    public int getNumOfHorses(Stable stable) {
        return numOfHorses;
    }

    public void addToStable(Horse horse) {
        horses.add(horse);
    }

    public String getHorses(Stable stable) {
        String str = "";
        for (int i = 0; i < horses.size(); i++) {
            str = str + horses.get(i);
        }
        return str;
    }
}
